package chapter07;

public class _01_Array {

	public static void main(String[] args) {
		// 1차원 배열 선언 및 접근 연습
		// int a,  b,  c,  d,  e;
		//   a[0] [1] [2] [3] [4]
		int[] a;
		a = new int[5];
		
		a[2] = 99;
		a[4] = 34;
		a[0] = a[2] + a[4];
		
		for(int i=0; i<5; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		

	}

}
