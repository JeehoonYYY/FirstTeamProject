package homework;

import java.util.Scanner;

public class CelToFahTest {

//	public static void main(String[] args) {
//		
//		//	내가 한거
//		Scanner in = new Scanner(System.in);
//		System.out.print("섭씨 입력 : ");
//		int celsius = in.nextInt();
//		in.close();
//		
//		double result = CelToFah(celsius);
//		System.out.printf("섭씨 %d도 -> %.0f도", celsius, result);
//	}
//
//	public static double CelToFah(int aa) {
//		double fahrenheit = (aa * 1.8) + 32;
//		return fahrenheit;
//		
//		
//		
//	}
	
	
	public static double CelToFah(int celsius) {
		double fah;
		fah = celsius * 1.8 + 32;
		return fah;
	}
	
	public static void main(String[] args) {
		int celsius;
		Scanner in = new Scanner(System.in);
		System.out.print("섭씨 입력 : ");
		celsius = in.nextInt();
		
		System.out.printf("섭씨 %d도 -> %.0f도\n", celsius, CelToFah(celsius));
		in.close();
	}
	
}
