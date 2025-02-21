package miniproject;

import java.util.Scanner;

public class Airplane {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menuSelect = 0, signInMenu;
		String userId = "", userPwd = "", airlineFrom="",airlineTo="", airlineDepart="YYYY-MM-DD", airlineReturn="";
		String chkId = "", chkPwd = "";
		String []flight = {};

		
		while (true) {
			System.out.println(" * KOREAN AIR *\t\t\t\t\t\t\t\tKOR/ENG");
			System.out.println("===============================================================================");
			System.out.println("1. 로그인\t\t2. 회원가입\t\t3. 회원탈퇴\t\t9. 종료");
			System.out.println("===============================================================================");
			System.out.print("입력 > ");
			menuSelect=sc.nextInt();
			
			switch (menuSelect) {
			
			case 1:
				System.out.print("·ID 입력 : ");
				userId=sc.next();
				System.out.print("·Password 입력 : ");
				userPwd=sc.next();
				
				System.out.println("\n * KOREAN AIR *\t\t\t\t\t\t\t\tKOR/ENG");
				System.out.println("===============================================================================");
				System.out.println("1. 항공권 예약\t 2. 항공권 조회\t 3. 항공권 취소\t 4. 좌석 변경\t 5. 로그아웃");
				System.out.println("===============================================================================");
				System.out.print("입력 > ");
				signInMenu=sc.nextInt();
				
				switch (signInMenu) {
				case 1:
					System.out.println("* 항공권 예약");
					System.out.print("· 출발지 : ");
					airlineFrom=sc.next();
					System.out.print("· 도착지 : ");
					airlineTo=sc.next();
					System.out.print("· 출항일 MMDD : ");
					airlineDepart=sc.next();
					System.out.print("· 회항일 MMDD : ");
					airlineReturn=sc.next();
					
//					airlineFrom.equals(airlineFromTag)
//					airlineTo.equals(arilineToTag)
//					airlineDepart.equals(airlineDepartTag)
//					airlineReturn.equals(airlineReturnTag)
					
//					스캐너와 동일한 문자열의 항공편 출력
					
						
					}
				}
			}
	}
}
