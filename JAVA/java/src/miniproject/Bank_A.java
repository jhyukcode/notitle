package miniproject;
import java.util.Scanner;

class Bank_v{
	// 인스턴스 변수
	private String id;
	private String pass;
	private double balance;
	// 클래스 변수
	static String Company="(주)회사";
	// 생성자
	public Bank_v(String id, String pass, double balance) {
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
		return "Bank_v [id=" + id + ", pass=" + pass + ", balance=" + balance + "]";
	}
}
interface Bank_Controller_{
	void exec(Bank_v[] users);
}
class Login_ {
	public static boolean login(Bank_v[] users) {
		Scanner sc = new Scanner(System.in);
		for(Bank_v z:users) {
			System.out.println("ID 입력");
			String tempId = sc.nextLine();
			System.out.println("비밀번호 입력");
			String tempPwd = sc.nextLine();
			if (z.getId()==null) {System.out.println("ID 정보가 존재하지 않습니다\n");return false;}
			if (!( z.getId().equals(tempId) && z.getPass().equals(tempPwd) )) {
				System.out.println("ID 혹은 비밀번호가 다릅니다\n");
				return false;}
		}
		return true;
	}
}
class Menu_{ 
	Bank_v[] users;
	public void exec() {
		Scanner sc = new Scanner(System.in);
		Bank_v[] users = new Bank_v[1];
		while(true) {
			System.out.println(Bank_v.Company+" BANK SYSTEM");
			System.out.println("1. 생성\t2. 조회\n3. 입금\t4. 출금\n5. 삭제\t6. 종료");
			System.out.print("> ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1: Input_ input = new Input_(); input.exec(users); break;
			case 2:	Show_ show = new Show_(); show.exec(users); break;
			case 3:	Deposit_ deposit = new Deposit_(); deposit.exec(users); break;
			case 4:	Withdraw_ withdraw = new Withdraw_(); withdraw.exec(users); break;
			case 5: Delete_ delete = new Delete_(); delete.exec(users); break;
			case 6: System.out.println("서비스를 종료합니다\n이용해주셔서 감사합니다");return;
				default : System.out.println("\n\n"); continue;
			}
		}
	}
}
class Input_ implements Bank_Controller_{
	Scanner sc = new Scanner(System.in);
//	새 계정 생성
	@Override
	public void exec(Bank_v[] users) {
		System.out.println("사용할 ID 입력");
		String newId = sc.nextLine();
		System.out.println("사용할 PASSWORD 입력");
		String newPwd = sc.nextLine();
		double balanceReset = 0.0;			
        Bank_v user = new Bank_v(newId, newPwd, balanceReset);
        	for (int i = 0; i < users.length; i++) {
        		if (users[i] == null) {
        			users[i] = user;
        			System.out.println("생성됨");
        		}
        	}
        	for(Bank_v o:users) {
        		if(o.getId()==null) { o.setId(newId); o.setPass(newPwd);
        		System.out.println("재생성됨");
        		} 
        	}
        	System.out.println("회원가입이 정상적으로 완료되었습니다");
        	return;
	}
}
class Show_ implements Bank_Controller_{
	@Override
	public void exec(Bank_v[] users) {
		if (Login_.login(users)) {
			for(Bank_v b:users) {
				System.out.println(b.getId()+"님\n"+"계좌 예금 : "+b.getBalance());
			}
		return;
		}
	}
}
class Deposit_ implements Bank_Controller_{
	@Override
	public void exec(Bank_v[] users) {
		if (Login_.login(users)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("입금할 금액 입력");
			int deposit = sc.nextInt();
			if(deposit<0) { System.out.println("입금을 취소하고 메인 화면으로 돌아갑니다"); }
			else { System.out.println(deposit+" 이 입금되었습니다"); 
				for(Bank_v b:users) {
					b.setBalance(deposit+b.getBalance());
					System.out.println(b.getId()+"님\n"+"계좌 예금 : "+b.getBalance());
				};
			}
		}
	}
}
class Withdraw_ implements Bank_Controller_{
	@Override
	public void exec(Bank_v[] users) {
		if (Login_.login(users)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("출금할 금액 입력");
			int withdraw = sc.nextInt();
			if(withdraw<0) {System.out.println("출금을 취소하고 메인 화면으로 돌아갑니다"); return; }
			for(Bank_v c:users) {
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
class Delete_ implements Bank_Controller_{
	@Override
	public void exec(Bank_v[] users) {
		if (Login_.login(users)) {
			Scanner sc = new Scanner(System.in);
			for(Bank_v a:users) {
				if(a.getBalance()>0) {
					System.out.println("계좌 내에 예금이 존재하여 삭제하실 수 없습니다"); return;} }
			System.out.println("계좌 삭제를 진행하시겠습니까? (Y/N)");
			char confirm = sc.next().charAt(0);
			if (confirm=='Y'||confirm=='y') {
				System.out.println("계좌가 정상적으로 삭제되었습니다\n이용해주셔서 감사합니다");
				for(Bank_v d:users) {
					d.setId(null); d.setPass(null); return; }
			} else { System.out.println("계좌 삭제 절차를 취소하셨습니다\n메인 화면으로 돌아갑니다"); return; }
		}
	}
}
public class Bank_A {
	public static void main(String[] args) {
		Menu_ menu = new Menu_();
		menu.exec();
	}
}