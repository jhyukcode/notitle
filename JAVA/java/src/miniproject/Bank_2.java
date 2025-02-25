package miniproject;

import java.util.Arrays;
import java.util.Scanner;

public class Bank_2 {

	public static void main(String[] args) {

		int menuSelect = 0, age = 0;
		long balance = 0, deposit = 0, withdraw = 0;
		char del = ' ';
		String userId = "", userPwd = "", chkId = "", chkPwd = "";
		String[] user_identification = new String[4];
		String[] mainMenu = {"추가", "조회", "입금", "출금", "삭제"}; 
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("===BANK MENU===");
			for (int i=0;i<mainMenu.length;i++) {
				System.out.print("\n"+(i+1)+". "+mainMenu[i]);
			}
			System.out.print("\n9. 종료");
			System.out.print("\n입력 > ");
			menuSelect = sc.nextInt();

			switch (menuSelect) {
			case 1:
				// 계정 생성
				for (;;) {
					if (user_identification[0]==null) {
						System.out.print("ID 생성 : ");
						user_identification[0]=sc.next();
						user_identification[1]=user_identification[0];
						continue;
					}

					if (user_identification[2]==null) {
						System.out.print("비밀번호 생성 : ");
						user_identification[2] = sc.next();
						continue;
					}

					if (!user_identification[2].equals(user_identification[3])) {
						System.out.print("비밀번호 확인 : ");
						user_identification[3] = sc.next();
						continue;
					}
					if (age<=0) {
						System.out.print("나이 입력 : ");
						age = sc.nextInt();
						continue;
					}
					if (balance<=0) {
						System.out.print("계좌 생성 시에는 반드시 예치금이 필요합니다.\n입금하실 금액을 입력해주세요. : ");
						balance = sc.nextInt();
						continue;
					}
					break;
				}
				System.out.print("계좌가 성공적으로 생성되었습니다.\n");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
//				System.out.print("ID 입력 : ");
//				chkId = sc.next();
//				System.out.print("Pwd 입력 : ");
//				chkPwd = sc.next();
//
//				if (!(chkId.equals(userId) && chkPwd.equals(userPwd))) {
//					System.out.print("ID 또는 비밀번호가 일치하지 않습니다.\n");
//					break;
//				}
				if (!(user_identification[0].equals(user_identification[1]))) {
					
				}

				switch (menuSelect) {
				case 2:
					System.out.print("< " + chkId + " 님의 계좌 조회 >");
					System.out.print("\n나이 : " + age);
					System.out.print("\n잔액 : " + balance + "\n");
				break;

				case 3:
					System.out.print("입금 : ");
					deposit = sc.nextLong();

					if (deposit > 0) {
						System.out.print(deposit + "원이 입금되었습니다.\n");
						balance += deposit;
						System.out.print("현재 잔액 : " + balance + "\n");
					} else {
						System.out.print("입금하실 양을 정상적으로 입력해주시기 바랍니다.\n");
					}
				break;
					
				case 4:
					System.out.print("출금 : ");
					withdraw = sc.nextLong();

					if (balance >= withdraw && withdraw >= 0) {
						System.out.print(withdraw + "원을 출금하였습니다.\n");
						balance -= withdraw;
						System.out.print("현재 잔액 : " + balance + "\n");
					} else if (balance < withdraw) {
						System.out.print("예치금을 초과하여 출금하실 수 없습니다.\n");
					} else {
						System.out.print("출금하실 양을 정상적으로 입력해주시기 바랍니다.\n");
					}
					break;

				case 5:
					System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
					del = sc.next().charAt(0);

					if (del == 'Y' || del == 'y') {
						System.out.print("계좌가 정상적으로 삭제되었습니다.\n");
						userId = "";
						userPwd = "";
					} else if (del == 'N' || del == 'n') {
						System.out.print("계좌를 삭제하지 않고 메뉴로 돌아갑니다.\n");
					} else {
						System.out.print("Y 혹은 N 으로 정상적인 값으로 입력해주시기 바랍니다.\n");
					}
					break;
				}
				break;
				
			case 9:
				System.out.print("Bank 서비스를 종료합니다.\n");
				return;

			}
		}
	}
}
