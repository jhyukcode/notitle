package miniproject;
import java.util.Scanner;

class Bank_v7 {
	private String id;
	private String pass;
	private double balance;
	static String Company="(주)회사";
	public Bank_v7() {
		super(); }
	public Bank_v7(String id, String pass, double balance) {
		super();
		this.id = id;
		this.pass = pass;
		this.balance = balance;
	}
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }
	}
class Menu7{ 
	Bank_v7[] users = new Bank_v7[10];
	public void exec() {
		Scanner sc = new Scanner(System.in);
		Input input = new Input();
		Show show = new Show();
		System.out.println("first ID");
		String id = sc.next();
		System.out.println("pwd");
		String pd = sc.next();
		System.out.println("balance");
		double bc = sc.nextDouble();
		Bank_v7 newUser = new Bank_v7(id,pd,bc);
		users[0] = newUser;
		while(true) {
			System.out.println(Bank_v7.Company+" BANK SYSTEM");
			System.out.println("1. 생성\t2. 조회\n3. 입금\t4. 출금\n5. 삭제\t6. 종료");
			System.out.print("> ");
			int select = sc.nextInt();
		
		switch (select) {
		case 1: show.exec(users); break;
		case 2:
		case 3:
		case 4:
		case 5: 
		case 6: System.out.println("서비스를 종료합니다"); return;
		}
	}
	}
	}
interface Bank_Controller { void exec(Bank_v7[] users); }
class Input implements Bank_Controller{
	@Override
	public void exec(Bank_v7[] users) {

			}
	
		}
class Show implements Bank_Controller{
	@Override
	public void exec(Bank_v7[] users) {
		for(Bank_v7 user:users) {
			if(user!=null) {
				System.out.println("ID "+user.getId()+" BALANCE "+user.getBalance());
			}
		}
	}
}
//class Deposit implements Bank_Controller{ }
//class Withdraw implements Bank_Controller{ }
//class Delete implements Bank_Controller{ }

public class Bank_ {
	public static void main(String[] args) {
		Menu7 menu = new Menu7();
		menu.exec();
	}
}