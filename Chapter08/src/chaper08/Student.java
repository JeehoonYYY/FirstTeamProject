package chaper08;

public class Student extends Person {
	// 메서드
	public void set() {
		// weight = 75; 	// private은 외부 접근 불가
		setWeight(99);
		age = 30;			// 같은 폴더 디폴트는 접근 가능
		name = "홍길동";		// public은 모두 접근 가능
		height = 175;		// 상위 클래스 접근 가능
							// protected 같은 폴더, 자식 
	}
}
