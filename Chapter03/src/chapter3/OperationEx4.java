package chapter3;

public class OperationEx4 {

	public static void main(String[] args) {
		// 조건 연산자 실습
		int motherAge = 47;
		int fatherAge = 45;
		
		int diff;
		diff = (fatherAge > motherAge) ? (fatherAge - motherAge) : (motherAge - fatherAge);
		
		System.out.println("나이차: " + diff);
		
		int num = 9;
		boolean isEven;
		
		
		isEven = (num % 2) == 0 ? true : false;
		System.out.println(isEven);

	}

}
