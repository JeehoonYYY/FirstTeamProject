package chapter07;

public class _01_MultiArray {

	public static void main(String[] args) {
		// 다차원배열 3행 4열
		int[][] a = new int[3][4];
		
		a[1][2] = 99;
		a[2][0] = 123;
		a[2][3] = a[1][2] + a[2][0];	// 홍진호?!
		
//		System.out.println("행 갯수 : " + a.length);
//		System.out.println("열 갯수 : " + a[0].length);
		
		
		
//		System.out.println(a[2][3]);
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {					// 행 첨자
				System.out.printf("%3d ",a[i][j]);		// 열 첨자
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
