package homework;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
/*		int price, pay;
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("물건 가격 입력: ");
		price = in.nextInt();
		System.out.print("지불 금액 입력: ");
		pay  = in.nextInt();
		in.close();
		
	
		int change = pay - price;
		
		final int THOUSAND = 1000;
		final int FIVE_HUNDRED = 500;
		final int HUNDRED = 100;
		final int TEN = 10;
		
		int thousand = change / THOUSAND;
		int thousand2 = change % THOUSAND;
		int fiveHundred = thousand2 / FIVE_HUNDRED;
		int fiveHundred2 = thousand2 % FIVE_HUNDRED;
		int hundred = fiveHundred2 / HUNDRED;
		int hundred2 = fiveHundred2 % HUNDRED;
		int ten = hundred2 / TEN;
		int ten2 = hundred2 % TEN;
		
		System.out.println("-----------------------");
		System.out.println("거스름돈: " + change);
		System.out.println("-----------------------");
		System.out.println("1000원: " + thousand);
		System.out.println("500원: " + fiveHundred);
		System.out.println("100원: " + hundred);
		System.out.println("10원: " + ten);
*/	

		
		
		
/*
	거스름돈: 2920
	-----------------------------------------
	1000원: 2개 거스름돈 / 해당금액
	500원: 1개 (거스름돈 % 상위단위금액) / 해당금액
	100원: 4개 (거스름돈 % 상위단위금액) / 해당금액
	10원: 2개  (거스름돈 % 상위단위금액) / 해당금액
 */
		int price, payment, change;
		
		Scanner in = new Scanner(System.in);
		System.out.print("물건 가격 입력: ");
		price = in.nextInt();
		
		System.out.print("지불 금액 입력: ");
		payment = in.nextInt();
		System.out.println("------------------------");
		in.close();
		change = payment - price;
		System.out.printf("거스름돈: %d원\n", change);
		System.out.println("------------------------");
		System.out.printf("1000원: %d개\n", change/1000);	
		System.out.printf("500원: %d개\n", (change%1000)/500);	
		System.out.printf("100원: %d개\n", (change%500)/100);	
		System.out.printf("10원: %d개\n", (change%100)/10);	
		System.out.println("------------------------");
	}

}
