package review;

import java.util.Scanner;

public class _02_Buffer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = in.nextInt();
		in.nextLine();	// 입력 버퍼에 남아있는 엔터를 가져오는 작업
		
		System.out.print("문자열 입력 : ");
		String str = in.nextLine();
		
		in.close();
		System.out.printf("입력받은 정수는 %d이며, 문자열은 %s입니다.\n", n, str);
		
	}

}
