package part001;

public class SelfTest017 {
	public static void main(String[] args) {
		
		int[][] arr = new int[4][5];
		int a = 1;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = a++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
