package miniproject;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		int menuSelect = 0, age = 0, enter = 1;
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
//			초기 정보 입력
				System.out.print("ID 입력 : ");
				userId = sc.next();
				System.out.print("Password 입력 : ");
				userPwd = sc.next();
				System.out.print("나이 입력 : ");
				age = sc.nextInt();
				System.out.print("잔액 입력 : ");
				balance = sc.nextLong();
//			첫 생성 시 입금이 1원 이상 되지 않을 시 계좌 생성불가
				if (balance <= 0) {
					System.out.print("계좌 생성 시 1원 이상이 입금되어야 합니다.\n");
				}
				break;
//		2. 조회
			case 2:
//			identify
				System.out.print("ID 입력 : ");
				chkId = sc.next();
				System.out.print("Pwd 입력 : ");
				chkPwd = sc.next();
//			identify 완료 시 해당 아이디의 나이와 잔액 표시
				if (chkId.equals(userId) && chkPwd.equals(userPwd)) {
					System.out.print("< 계좌 조회 >");
					System.out.print("\n나이 : " + age);
					System.out.print("\n잔액 : " + balance + "\n");
					break;
//			identify 실패
				} else {
					System.out.print("ID 또는 비밀번호가 일치하지 않습니다.\n");
				}
				break;
//		3. 입금
			case 3:
//			identify
				System.out.print("ID 입력 : ");
				chkId = sc.next();
				System.out.print("Pwd 입력 : ");
				chkPwd = sc.next();
//			identify 완료 시 해당 계좌에 입금할 수량 입력
				if (chkId.equals(userId) && chkPwd.equals(userPwd)) {
					System.out.print("입금 : ");
					deposit = sc.nextLong();
//			입금할 양이 0을 초과하면 성공적으로 입금 처리 후 잔액 표시
					if (deposit > 0) {
						System.out.print(deposit + "원이 입금되었습니다.");
						balance += deposit;
						System.out.print("\n현재 잔액 : " + balance);
						break;
//			입금할 양이 정수가 아니거나, 음수값으로 반환될 시 실패 처리
					} else {
						System.out.print("입금 시에는 양수인 정수로 기입하셔야 합니다.\n");
						break;
					}
//			identify 실패
				} else {
					System.out.print("ID 또는 비밀번호가 일치하지 않습니다.\n");
				}
				break;
//		4. 출금
			case 4:
//			identify
				System.out.print("ID 입력 : ");
				chkId = sc.next();
				System.out.print("Pwd 입력 : ");
				chkPwd = sc.next();
//			identify 성공 시 출금할 수량 입력
				if (chkId.equals(userId) && chkPwd.equals(userPwd)) {
					System.out.print("출금 : ");
					withdraw = sc.nextLong();
					if (balance >= withdraw) {
						System.out.print(withdraw + "원을 출금하였습니다.\n");
						balance -= withdraw;
						System.out.print("\n현재 잔액 : " + balance + "\n");
						break;
					} else if (balance < withdraw) {
						System.out.print("예치금을 초과하여 출금하실 수 없습니다.\n");
						break;
					} else {
						System.out.print("비정상적 접근입니다.\n");
						break;
					}
				} else {
					System.out.print("ID 또는 비밀번호가 일치하지 않습니다.\n");
					break;
				}
//		5.삭제
			case 5:
				System.out.print("ID 입력 : ");
				chkId = sc.next();
				System.out.print("Pwd 입력 : ");
				chkPwd = sc.next();

				if (chkId.equals(userId) && chkPwd.equals(userPwd)) {
					System.out.print("계좌를 삭제하시겠습니까? (Y/N)");
					del = sc.next().charAt(0);
					if (del == 'Y') {
						System.out.print(userId + " 계좌가 삭제되었습니다.\n");
						userId = "";
						userPwd = "";
						break;
					} else if (del == 'N') {
						System.out.print("계좌를 삭제하지 않고 메뉴로 돌아갑니다.\n");
						break;
					} else {
						System.out.print("비정상적인 접근입니다.\n");
						break;
					}

				} else {
					System.out.print("ID 또는 비밀번호가 일치하지 않습니다.\n");
					break;
				}
//		9. 종료
			case 9:
				System.out.print("Bank 서비스를 종료합니다.\n");
				return;
			}
		}

	}

}
