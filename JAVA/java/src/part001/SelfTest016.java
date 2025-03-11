package part001;

public class SelfTest016 {
	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j] = (i+1)*100+j;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
