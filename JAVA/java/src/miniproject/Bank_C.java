package miniproject;
import java.util.Arrays;
import java.util.Scanner;

class Bank_C2{
	// 인스턴스 변수
	private String id;
	private String pass;
	private double balance;
	// 클래스 변수
	static String Company="(주)회사";
	// 생성자
	public Bank_C2(String id, String pass, double balance) {
		super(); this.id = id; this.pass = pass; this.balance = balance; }
	// getter/setter
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }
	@Override
	public String toString() {
		return "Bank_C [id=" + id + ", pass=" + pass + ", balance=" + balance + "]";
	}
}
interface Bank_Controller_C{ void exec(Bank_C2[] users); }

class Login_C {
	public static String login(Bank_C2[] users) {	// 로그인 실패 시 null 값 반환
		Scanner sc = new Scanner(System.in);
		System.out.print("\nID입력 : "); String tempId = sc.next();
		System.out.print("\n입력된 ID : "+tempId);
		System.out.print("\n비밀번호 입력 : "); String tempPwd=sc.next();
		for(Bank_C2 b:users) {
			if(b==null) { continue; }
			if(b.getId().equals(tempId) && b.getPass().equals(tempPwd)) { return b.getId();}
		}
		System.out.println("ID 혹은 비밀번호가 일치하지 않습니다\n");
		return null;
	}
}
class UserSearch{
	public static Integer UserId (Bank_C2[] users ,String Id) {
		int i=-1;
		for(Bank_C2 b:users) {
			i++;
			if ( b==null || (!(b.getId().equals(Id))) ) { continue; }
			return i; }
		return 0;
	}
}
class Menu_C{
	Bank_C2[] users;
	Bank_Controller_C controller;
	Bank_Controller_C[] process;
	public Menu_C() {
		super(); users = new Bank_C2[3];
		process = new Bank_Controller_C[] { new Input_C() , new Show_C() , new Deposit_C() , new Withdraw_C() ,new Delete_C() }; }
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int num = -100;
		while(true) {
			try {
			System.out.println(Arrays.toString(users));
			System.out.print(Bank_C2.Company+" BANK SYSTEM\n1. 생성\t2. 조회\n3. 입금\t4. 출금\n5. 삭제\t6. 종료\n> ");
			num = sc.nextInt();}
			catch (Exception e) { sc.next();}
			if(num==6) { System.out.println("\n서비스를 종료합니다"); return; }
			if(num>6||num<1) { System.out.println("\n"); continue;}
			controller = process[num-1]; controller.exec(users);
		}
	}
}
class Input_C implements Bank_Controller_C{
	Scanner sc = new Scanner(System.in);
//	새 계정 생성
	@Override
	public void exec(Bank_C2[] users) {
		System.out.println("사용할 아이디 입력");
		String newId = sc.nextLine();
		System.out.println("사용할 비밀번호 입력");
		String newPwd = sc.nextLine();
		double balanceReset = 0.0;			
        Bank_C2 user = new Bank_C2(newId, newPwd, balanceReset);
        for (int i = 0; i < users.length; i++) {
        	if (users[i] == null) {
        		users[i] = user;
        		System.out.println("\nID : "+newId+" 회원가입이 정상적으로 완료되었습니다\n\n");
        		return;
        	}
        }
	}
}
class Show_C implements Bank_Controller_C{
	@Override
	public void exec(Bank_C2[] users) {
		String tempId = Login_C.login(users);
		if (tempId==null) {return;}
		
		int u = UserSearch.UserId(users, tempId);
		System.out.println("\nID : "+users[u].getId()+"님\n계좌 예금 : "+users[u].getBalance()+"\n\n");
	}
}
class Deposit_C implements Bank_Controller_C{
	@Override
	public void exec(Bank_C2[] users) {
		String tempId = Login_C.login(users);
		if (tempId==null) {return;}
		
		System.out.print("입금할 금액 입력 : ");
		Scanner sc = new Scanner(System.in);
		int deposit = sc.nextInt();
		
		if(deposit<=0) { System.out.println("입금을 취소하고 메인 화면으로 돌아갑니다\n"); }
		else { System.out.println("\n금액 "+deposit+" 정상 입금되었습니다\n");
		
		int u=UserSearch.UserId(users, tempId);
		users[u].setBalance(users[u].getBalance()+deposit);
		System.out.println("\nID : "+users[u].getId()+"님\n계좌 예금 : "+users[u].getBalance()+"\n\n");
		
//		for(Bank_C2 b:users) {
//			if ((b==null)||(!(b.getId().equals(tempId)))) {continue;}	// null 값이거나 로그인 정보로 받아온 tempId 값과 불일치 시 continue
//			b.setBalance(deposit+b.getBalance());
//			System.out.println("\nID : "+b.getId()+"\n계좌 예금 : "+b.getBalance()+"\n\n");
//			}
		}
	}
}
class Withdraw_C implements Bank_Controller_C{
	@Override
	public void exec(Bank_C2[] users) {
		String tempId = Login_C.login(users);
		if(tempId==null) {return;}
		
		System.out.print("출금할 금액 입력 : ");
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		if(withdraw<0) {System.out.println("출금을 취소하고 메인 화면으로 돌아갑니다\n\n"); return; }
		
		int u = UserSearch.UserId(users, tempId);
		if(withdraw>users[u].getBalance()) { System.out.println("출금 금액은 계좌 내 금액을 초과하실 수 없습니다"); return; }
		System.out.println("금액 "+withdraw+" 이 정상 출금되었습니다");
		users[u].setBalance(users[u].getBalance()-withdraw);
		System.out.println("ID : "+tempId+"\n계좌 예금 : "+users[u].getBalance()+"\n\n");
	}
}
class Delete_C implements Bank_Controller_C{
	@Override
	public void exec(Bank_C2[] users) {
		String tempId = Login_C.login(users);
		if(tempId==null) {return;}
		
		int u = UserSearch.UserId(users, tempId);
		if (users[u].getBalance()>0) { System.out.println("해당 계좌에 예금이 존재하여 삭제하실 수 없습니다"); return; }
		System.out.println("[ID : "+users[u].getId()+"]"+" 계좌 삭제를 진행하시겠습니까? (Y/N)");
		
		Scanner sc = new Scanner(System.in);
		char confirm = sc.next().charAt(0);
		if(confirm=='Y'||confirm=='y') { 
			System.out.println("계좌가 삭제되었습니다\n\n"); users[u] = null; }
		else { System.out.println("계좌 삭제 절차를 취소하셨습니다\n\n"); }
	}
}
public class Bank_C {
	public static void main(String[] args) {
		Menu_C menu = new Menu_C();
		menu.exec();
	}
}