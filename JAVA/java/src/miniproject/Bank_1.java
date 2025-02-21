package miniproject;

import java.util.Scanner;

public class Bank_1 {

	public static void main(String[] args) {

		int menuSelect = 0, age = 0;
		long balance = 0, deposit = 0, withdraw = 0;
		char del = ' ';
		String userId = "", userPwd = "", chkId = "", chkPwd = "";
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("===BANK MENU===");
			System.out.print("\n1. 추가");
			System.out.print("\n2. 조회");
			System.out.print("\n3. 입금");
			System.out.print("\n4. 출금");
			System.out.print("\n5. 삭제");
			System.out.print("\n9. 종료");
			System.out.print("\n입력 > ");
			menuSelect = sc.nextInt();

			switch (menuSelect) {
//		1. 추가
			case 1:
				// 초기 정보 입력
				System.out.print("ID 입력 : ");
				userId = sc.next();
				System.out.print("Password 입력 : ");
				userPwd = sc.next();
				System.out.print("나이 입력 : ");
				age = sc.nextInt();
				System.out.print("예치금 입력 : ");
				balance = sc.nextLong();

				if (balance <= 0) {
					System.out.print("계좌 생성 시 1원 이상이 입금되어야 합니다.\n");
					break;
				}

				System.out.print("ID : " + userId + " 님의 계좌가 성공적으로 생성되었습니다.\n");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.print("ID 입력 : ");
				chkId = sc.next();
				System.out.print("Pwd 입력 : ");
				chkPwd = sc.next();

				if (!(chkId.equals(userId) && chkPwd.equals(userPwd))) {
					System.out.print("ID 또는 비밀번호가 일치하지 않습니다.\n");
					break;
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
