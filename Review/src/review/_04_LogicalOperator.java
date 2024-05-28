package review;

public class _04_LogicalOperator {

	public static void main(String[] args) {
		// 관계연산과 논리연산 실습
		System.out.println(3 == 2);	// 일치여부
		System.out.println(!(3 == 2));	//부정
		System.out.println((3>2) && (3>4));	//true && false = > false
		//	논리곱: 두개항이 모두 true이면 true
		//	논리합: 두개항중 어느 하나라도 true이면 true
		System.out.println((3 != 2) || (-1>0));
	}

}
