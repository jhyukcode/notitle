package miniproject;

import java.util.Arrays;
import java.util.Scanner;

public class Bank_2 {
	
	public static void main(String[] args) {

//		변수
		int menuSelect = 0;
		long balance = 0, deposit = 0, withdraw = 0;
		char delete_confirm = ' ';
		String temp_id = " ", temp_password=" ";
		String[] user_identification = new String[3];
		String[] mainMenu = {"추가", "조회", "입금", "출금", "삭제"}; 
		Scanner sc = new Scanner(System.in);

//		메인메뉴
		while (true) {
			System.out.print("├────BANK MENU────┤");
			for (int i=0;i<mainMenu.length;i++) { System.out.print("\n"+(i+1)+". "+mainMenu[i]); }
			System.out.print("\n9. 종료\n입력 > ");
			menuSelect = sc.nextInt();
			
			switch (menuSelect) {
			case 1:
				// 계정 생성
				System.out.println("생성하려는 아이디를 입력해주세요");
				temp_id=sc.next();
				user_identification[0]=temp_id;
				
				System.out.println("사용하려는 비밀번호를 입력해주세요");
				temp_password=sc.next();
				user_identification[1]=temp_password;
				temp_password=null;
				
				for (;;) {
					if (!(user_identification[1].equals(temp_password))) {
					System.out.println("입력하신 비밀번호를 다시 입력해주세요");
					temp_password=sc.next();
					continue; } break; }
				// ↑ 처음에 입력한 비밀번호를 다시 입력받고 아닐 시 무한반복
				System.out.println("고객님의 연령을 입력해주세요");
				user_identification[2] = sc.next();
				
				System.out.println("초기 예금을 입력해주세요");
				balance = sc.nextLong();
				
				System.out.println("계좌가 성공적으로 생성되었습니다.\n");
				break;
				
			case 2: case 3: case 4: case 5:
				System.out.println("아이디를 입력해주세요.");
				temp_id=sc.next();
				System.out.println("비밀번호를 입력해주세요.");
				temp_password=sc.next();
				if (!(user_identification[0].equals(temp_id) && user_identification[1].equals(temp_password))) {
					System.out.println("아이디 혹은 비밀번호가 틀렸습니다\n"); continue; }
				// ↑ 입력받은 아이디와 비밀번호가 다를 경우 해당 케이스를 continue(스킵)함.
				switch (menuSelect) {
				
				case 2:
					System.out.println("< 정보 조회 >");
					System.out.println("나이 : " + user_identification[2]);
					System.out.println("예금 : " + balance + "\n");
				break;
				
				case 3:
					System.out.println("입금하실 금액을 입력해주세요");
					deposit = sc.nextLong();
					for (;;) {
					if (!(deposit >= 0)) {
						System.out.println("임금하시려는 금액을 다시 확인해주세요\n");
						deposit = sc.nextLong();
						continue; } break;}
					// ↑ deposit(입금)이 0 이상 입력받을 때까지 무한반복 
					System.out.println(deposit + "이 입금되었습니다");
					balance += deposit;
					System.out.println("예금 : " + balance + "\n");
				break;
					
				case 4:
					System.out.println("출금하실 금액을 입력해주세요 ");
					withdraw = sc.nextLong();
					for (;;) {
					if (!(balance >= withdraw)) {
						System.out.println("출금하시려는 금액이 현재 예금을 초과합니다");
						withdraw = sc.nextLong();
						continue;} break; }
					// ↑ balance(예금)가 withdraw(출금)(예금이 출금보다 적으면)이상이 아닌 경우 무한반복
					balance -= withdraw;
					System.out.println(withdraw + "이 출금되었습니다\n잔액 : "+balance+"\n");
				break;

				case 5:
					if (balance>0) {
						System.out.println("해당 계좌에 예금이 존재하여 삭제를 진행할 수 없습니다\n");
					break; } // case 5 break
					System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
					delete_confirm = sc.next().charAt(0);
					if (delete_confirm == 'Y' || delete_confirm == 'y') {
						System.out.println("계좌가 정상적으로 삭제되었습니다.\n");
						for (int i=0;i<user_identification.length;i++) { user_identification[i] = " "; }
						// ↑ 원래 존재하던 유저 아이디 정보 삭제
					} else { System.out.println("계좌를 삭제하지 않고 메뉴로 돌아갑니다.\n"); continue; } break;
				} // case 2 3 4 5 switch
				break; 
				
			case 9:
				System.out.print("Bank 서비스를 종료합니다\n");
				return;

			} // main menu switch
		} // main menu while 
	} // main
} // class
