package homework;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
//		내가 한거
//		int num, remainder2, remainder3;
//		
//		System.out.print("정수 입력 : ");
//		Scanner in = new Scanner(System.in);
//		num = in.nextInt();
//		in.close();
//		
//		remainder2 = num % 2;
//		remainder3 = num % 3;
//		
//		if(remainder2 == 0 && remainder3 == 0) {
//			System.out.println(num + "은(는) 2의 배수 이면서, 3의 배수입니다.");
//		}else {
//			if(remainder2 == 0) {
//				System.out.println(num + "은(는) 2의 배수입니다.");
//			}
//			if(remainder3 == 0) {
//				System.out.println(num + "은(는) 3의 배수입니다.");}
//		}
//		if(remainder2 != 0 && remainder3 != 0) {
//			System.out.println(num + "은(는) 2의 배수도 3의 배수도 아닙니다.");
//		}
//
		
		
		
		int num;
		System.out.print("정수 입력 : ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		
//		if(num%2 == 0) {
//			if(num%3 == 0) {
//				System.out.printf("%d은(는) 2의 배수 이면서, 3의 배수입니다.", num);
//			}else {
//				System.out.printf("%d은(는) 2의 배수입니다.", num);
//			}
//		}else {
//			if(num%3 == 0) {
//				System.out.printf("%d은(는) 3의 배수입니다.", num);
//			}else {
//				System.out.printf("%d은(는) 2의 배수도 3의 배수도 아닙니다.", num);
//			}
//			
//		}
		
		
		
		
		if(num%2 == 0 && num%3 == 0){
			System.out.printf("%d은(는) 2의 배수 이면서, 3의 배수입니다.", num);
		}else if(num%2 == 0) {
			System.out.printf("%d은(는) 2의 배수입니다.", num);
		}else if(num%3 == 0){
			System.out.printf("%d은(는) 3의 배수입니다.", num);
		}else {
			System.out.printf("%d은(는) 2의 배수도 3의 배수도 아닙니다.", num);
		}
		
		
		
	}

}
