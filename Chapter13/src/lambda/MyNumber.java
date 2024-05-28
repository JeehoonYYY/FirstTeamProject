package lambda;

@FunctionalInterface
public interface MyNumber {				// BinaryOperator 인터페이스와 동일
	int getMax(int num1, int num2);		// apply 추상메서드
//	int add(int num1, int num2);
}
