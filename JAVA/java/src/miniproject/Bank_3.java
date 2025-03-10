package miniproject;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UserInfo_Bank{
	private String name, userid, userpwd;
	private int balance;
	public UserInfo_Bank(String name, String userid, String userpwd, int balance) {
		super();
		this.name = name; this.userid = userid; this.userpwd = userpwd; this.balance = balance; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getUserid() { return userid; }
	public void setUserid(String userid) { this.userid = userid; }
	public String getUserpwd() { return userpwd; }
	public void setUserpwd(String userpwd) { this.userpwd = userpwd; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }
}
class User_Sign_up{
	
}

public class Bank_3 {
	public static void main(String[] args) {
		System.out.println("┌┴┼┘BANK MENU└┼┴┐");
		System.out.println("1.추가\t4.출금\n2.조회\t5.삭제\n3.입금\t6.종료\n입력> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Set<UserInfo_Bank> bankUser = new HashSet<>();
	}
}
