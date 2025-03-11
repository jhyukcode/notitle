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
			case 3:
			case 4:
			case 5:
			case 6:
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
//	user[i]가 비어있지 않다면 계정 생성
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                System.out.println("새 사용자가 등록되었습니다.");
                for(Bank_v a:users) {System.out.println(a);}
                break;
            }
        }
	}
}
class Show_ implements Bank_Controller_{
	@Override
	public void exec(Bank_v[] users) {
		Scanner sc = new Scanner(System.in);
		for(Bank_v a:users) {
			System.out.println("ID 입력");
			String tempId = sc.nextLine();
			System.out.println("비밀번호 입력");
			String tempPwd = sc.nextLine();
			if (!(tempId.equals(a.getId()))||(tempPwd.equals(a.getPass()))) {
				System.out.println("ID 혹은 비밀번호가 다릅니다."); continue;}
			}
		for(Bank_v b:users) {
			System.out.println(b.getId()+"님\n"+"계좌 예금 : "+b.getBalance());
		}
		return;
	}
	
}
public class Bank_re {
	public static void main(String[] args) {
		Menu_ menu = new Menu_();
		menu.exec();
		}
	}