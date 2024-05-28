package homework;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 내가 한거
//		final double sale = 0.75;	// 상수는 대문자로
//		final int charge = 3500;	// 배송비,	상수는 대문자로
//		int goods;
//		double price;
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("물건 가격: ");
//		goods = input.nextInt();
//	
//		input.close();
//		
//		price = goods * sale + charge;
//		
//		System.out.println("회원님의 최종 결제금액(배송비 포함)은 " + (int)price + "원 입니다.");
		
		final int DELIVERY_FEE = 3500;
		int price;
		double finalPrice;
		
		System.out.print("물건 가격: ");
		Scanner in = new Scanner(System.in);
		price = in.nextInt();
		in.close();
		
		finalPrice = (price * 0.75) + DELIVERY_FEE;
		System.out.printf("회원님의 최종 결제금액(배송비 포함)은 %.0f원입니다.", finalPrice);
	}

}
