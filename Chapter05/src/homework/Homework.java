package homework;

import java.util.Scanner;

public class Homework {
	
	// 내가 한거
//	public static int square(int num1, int num2) {
//		int i;
//		int result = 1;
//		for(i=1; i<=num2; i++) {
//			result = result * num1;	
//		}
//		return result;
//	}
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("밑수 입력 : ");
//		int x = in.nextInt();
//		System.out.print("지수 입력 : ");
//		int y = in.nextInt();
//		in.close();
//		
//		System.out.println(x + " ^ " + y + " = " + square(x, y));
//	}

	public static void main(String[] args) {
		// n1 의 n2승을 구해 리턴하는 메소드
		Scanner in = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.print("첫번째수 입력 : ");
		n1 = in.nextInt();
		System.out.print("두번째수 입력 : ");
		n2 = in.nextInt();
		in.close();
		
		System.out.printf("%d ^ %d = %3d\n", n1, n2, power(n1, n2));
		System.out.printf("%d + %d = %3d\n", n1, n2, add(n1, n2));
		System.out.printf("%d - %d = %3d\n", n1, n2, substract(n1, n2));
	}
	
	public static int substract(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int add(int n1, int n2) {
		int result = 0;
		result = n1 + n2;
		return result;
	}
	
	public static int power(int n1, int n2) {
		int square = 1;
		for(int i=0; i<n2; i++) {
			square = square * n1;
		}
		return square;
	
	}
	
	
}
