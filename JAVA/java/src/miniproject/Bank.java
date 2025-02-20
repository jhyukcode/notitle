package miniproject;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		int menuSelect = 0, age = 0;
		long balance = 0, deposit = 0, withdraw = 0;
		char del = ' ';
		String userId = "", userPwd = "";
		String chkId = "", chkPwd = "";
		Scanner scInt = new Scanner(System.in);
		Scanner scLon = new Scanner(System.in);
		Scanner scchr = new Scanner(System.in);
		Scanner scStr1 = new Scanner(System.in);
		Scanner scStr2 = new Scanner(System.in);
		
		while (true) {
		System.out.print("===BANK MENU===");
		System.out.print("\n1. 추가");
		System.out.print("\n2. 조회");
		System.out.print("\n3. 입금");
		System.out.print("\n4. 출금");
		System.out.print("\n5. 삭제");
		System.out.print("\n9. 종료");
		System.out.print("\n입력 > ");
		menuSelect = scInt.nextInt();

		switch (menuSelect) {
//		1. 추가
		case 1:
			System.out.print("ID 입력 : ");
			userId = scStr1.nextLine();
			System.out.print("Password 입력 : ");
			userPwd = scStr2.nextLine();
			System.out.print("나이 입력 : ");
			age = scInt.nextInt();
			System.out.print("잔액 입력 : ");
			balance = scLon.nextLong();
			if (balance <= 0) {
				System.out.print("비정상적 접근입니다.");
			}
			break;
//		2. 조회
		case 2:
			System.out.print("ID 입력 : ");
			chkId = scStr1.nextLine();
			System.out.print("Pwd 입력 : ");
			chkPwd = scStr2.nextLine();

			if (chkId == userId && chkPwd == userPwd) {
				System.out.print("<	계좌 조회	>");
				System.out.print("\n나이 : " + age);
				System.out.print("\n잔액 : " + balance);
				break;
			} else {
				System.out.print("ID 또는 비밀번호가 일치하지 않습니다.");
			}
			break;
//		3. 입금
		case 3:
			System.out.print("ID 입력 : ");
			chkId = scStr1.nextLine();
			System.out.print("Pwd 입력 : ");
			chkPwd = scStr2.nextLine();

			if (chkId == userId && chkPwd == userPwd) {
				System.out.print("입금 : ");
				deposit = scLon.nextLong();
				if (deposit >= 0) {
					System.out.print(deposit + "원이 입금되었습니다.");
					balance += deposit;
					System.out.print("\n현재 잔액 : " + balance);
					break;
				} else {
					System.out.print("비정상적 접근입니다.");
					break;
				}
			} else {
				System.out.print("ID 또는 비밀번호가 일치하지 않습니다.");
			}
			break;
//		4. 출금
		case 4:
			System.out.print("ID 입력 : ");
			chkId = scStr1.nextLine();
			System.out.print("Pwd 입력 : ");
			chkPwd = scStr2.nextLine();

			if (chkId == userId && chkPwd == userPwd) {
				System.out.print("출금 : ");
				withdraw = scLon.nextLong();
				if (balance >= withdraw) {
					System.out.print(withdraw + "원을 출금하였습니다.");
					balance -= withdraw;
					System.out.print("\n현재 잔액 : " + balance);
					break;
				} else {
					System.out.print("비정상적 접근입니다.");
					break;
				}
			} else {
				System.out.print("ID 또는 비밀번호가 일치하지 않습니다.");
				break;
			}
//		5.삭제
		case 5:
			System.out.print("ID 입력 : ");
			chkId = scStr1.nextLine();
			System.out.print("Pwd 입력 : ");
			chkPwd = scStr2.nextLine();

			if (chkId == userId && chkPwd == userPwd) {
				System.out.print("계좌를 삭제하시겠습니까? (Y/N)");
				del = scchr.next().charAt(0);
				if (del == 'Y') {
					System.out.print(userId + " 계좌가 삭제되었습니다.");
					userId = "";
					userPwd = "";
					break;
				} else if (del == 'N') {
					System.out.print("계좌를 삭제하지 않고 메뉴로 돌아갑니다.");
					break;
				} else {
					System.out.print("비정상적인 접근입니다.");
					break;
				}

			} else {
				System.out.print("ID 또는 비밀번호가 일치하지 않습니다.");
				break;
			}
//		9. 종료
		case 9:
			System.out.print("Bank 서비스를 종료합니다.");
			return ;
		}
		}

	}

}
