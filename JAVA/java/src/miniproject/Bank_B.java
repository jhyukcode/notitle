package miniproject;
import java.util.Scanner;

class Bank_w{
	// 인스턴스 변수
	private String id;
	private String pass;
	private double balance;
	// 클래스 변수
	static String Company="(주)회사";
	// 생성자
	public Bank_w(String id, String pass, double balance) {
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
		return "Bank_w [id=" + id + ", pass=" + pass + ", balance=" + balance + "]";
	}
}
interface Bank_Controller_A{
	void exec(Bank_w[] users);
}
class Login_A {
	public static boolean login(Bank_w[] users) {
		Scanner sc = new Scanner(System.in);
		int logNum = -1;
		System.out.println("ID입력");
		String tempId = sc.nextLine();
		for(Bank_w a:users) {
			logNum++;
			if(a.getId().equals(tempId)) {
				System.out.println("비밀번호 입력"); 
				String tempPwd = sc.next();
				if(a.getPass().equals(tempPwd)) {
					System.out.println(a.getId()+"로그인 성공");
					return true;
					} else { System.out.println("비밀번호가 틀렸습니다");}
			}
		}
		return false;
	}
}
class Menu_A{ 
	Bank_w[] users;
	Bank_Controller_A controller;
	Bank_Controller_A[] process;
	public Menu_A() {
		super();
		users = new Bank_w[3];
		process = new Bank_Controller_A[] 
				{ new Input_A() , new Show_A() , new Deposit_A() , new Withdraw_A() ,new Delete_A() }; 
	}
	public void exec() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(Bank_w.Company+" BANK SYSTEM\n1. 생성\t2. 조회\n3. 입금\t4. 출금\n5. 삭제\t6. 종료\n>");
			int num = sc.nextInt();
			controller = process[num-1]; controller.exec(users);
			if(num==6) { System.out.println("서비스를 종료합니다\n이용해주셔서 감사합니다"); break;
			} else continue; } } 
}
class Input_A implements Bank_Controller_A{
	Scanner sc = new Scanner(System.in);
//	새 계정 생성
	@Override
	public void exec(Bank_w[] users) {
		System.out.println("사용할 ID 입력");
		String newId = sc.nextLine();
		System.out.println("사용할 PASSWORD 입력");
		String newPwd = sc.nextLine();
		double balanceReset = 0.0;			
        Bank_w user = new Bank_w(newId, newPwd, balanceReset);
        	for (int i = 0; i < users.length; i++) {
        		if (users[i] == null) {
        			users[i] = user;
        			System.out.println("생성됨");
        			break;
        		}
        	}
        	for(Bank_w a:users) {System.out.println(a);}
        	System.out.println("회원가입이 정상적으로 완료되었습니다");
        	return;
	}
}
class Show_A implements Bank_Controller_A{
	@Override
	public void exec(Bank_w[] users) {
		if (Login_A.login(users)) {
			for(Bank_w b:users) {
				System.out.println(b.getId()+"님\n"+"계좌 예금 : "+b.getBalance());
			}
		return;
		}
	}
}
class Deposit_A implements Bank_Controller_A{
	@Override
	public void exec(Bank_w[] users) {
		if (Login_A.login(users)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("입금할 금액 입력");
			int deposit = sc.nextInt();
			if(deposit<0) { System.out.println("입금을 취소하고 메인 화면으로 돌아갑니다"); }
			else { System.out.println(deposit+" 이 입금되었습니다"); 
				for(Bank_w b:users) {
					b.setBalance(deposit+b.getBalance());
					System.out.println(b.getId()+"님\n"+"계좌 예금 : "+b.getBalance());
				};
			}
		}
	}
}
class Withdraw_A implements Bank_Controller_A{
	@Override
	public void exec(Bank_w[] users) {
		if (Login_A.login(users)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("출금할 금액 입력");
			int withdraw = sc.nextInt();
			if(withdraw<0) {System.out.println("출금을 취소하고 메인 화면으로 돌아갑니다"); return; }
			for(Bank_w c:users) {
				if(!(withdraw>c.getBalance())) {
					System.out.println("금액 "+withdraw+"\n정상 출금되었습니다");
					c.setBalance(c.getBalance()-withdraw);
					System.out.println(c.getId()+"님\n계좌 예금 : "+c.getBalance());
				} else { System.out.println("예금을 초과하여 출금할 수 없습니다");
				}
			}
		}
	}
}
class Delete_A implements Bank_Controller_A{
	@Override
	public void exec(Bank_w[] users) {
		if (Login_A.login(users)) {
			Scanner sc = new Scanner(System.in);
			for(Bank_w a:users) {
				if(a.getBalance()>0) {
					System.out.println("계좌 내에 예금이 존재하여 삭제하실 수 없습니다"); return;} }
			System.out.println("계좌 삭제를 진행하시겠습니까? (Y/N)");
			char confirm = sc.next().charAt(0);
			if (confirm=='Y'||confirm=='y') {
				System.out.println("계좌가 정상적으로 삭제되었습니다\n이용해주셔서 감사합니다");
				for(Bank_w d:users) {
					d.setId(null); d.setPass(null); return; }
			} else { System.out.println("계좌 삭제 절차를 취소하셨습니다\n메인 화면으로 돌아갑니다"); return; }
		}
	}
}
public class Bank_B {
	public static void main(String[] args) {
		Menu_A menu = new Menu_A();
		menu.exec();
	}
}