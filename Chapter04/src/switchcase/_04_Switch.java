package switchcase;

import java.util.Scanner;

public class _04_Switch {

	public static void main(String[] args) {
		/*
		영문자를 입력받아 모음/자음을 판별하는 프로그램을 작성해보자
		A/a, E/e, I/i, O/o, U/u 는 모음이다.
		 */
		
		char ch;
		System.out.print("영문자 입력 : ");
		Scanner in = new Scanner(System.in);
		ch = in.nextLine().charAt(0);
		in.close();
		
		if(ch >= 'a' && ch <= 'z') {	//소문자라면
			//대문자로 변환
			ch = (char)(ch - 32);
		}

		switch(ch) {
		case 'A': case 'E': case 'I': case 'O': case 'U':
			System.out.println("모음입니다.\n");
			break;
		default:
			if (ch >= 'A' && ch <= 'Z') {
				System.out.println("자음입니다.\n");
			}else {
				System.out.println("영문자가 아닙니다.\n");
			}
		}
	}

}
