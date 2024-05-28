package chapter12;

public class _01_generics {
//	public static void printValue(int value) {
//		System.out.println(value);
//	}
//	public static void printValue(double value) {
//		System.out.println(value);
//	}
//	public static void printValue(String value) {
//		System.out.println(value);
//	}
	
	public static <T> void printValue(T value) {	// 앞뒤 T를 다른영문자로 써도 되나 앞과뒤를 맞춰줘야함
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		// 제네릭스 - [여러 자료형]을 변환할 수 있도록 프로그래밍한느 방식
		int intValue = 3;
		double doubleValue = 3.14;
		String stringValue = "안녕";
		
		printValue(intValue);
		printValue(doubleValue);
		printValue(stringValue);
	}

}
