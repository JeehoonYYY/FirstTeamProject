package chaper08;

class A {
	public A() {
		System.out.println("생성자 A");
	}
}

class B extends A{
	public B() {
		System.out.println("생성자 B");
	}
}

class C extends B{
	public C() {
		System.out.println("생성자 C");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		// 생성자 호출 실행 순서 테스트
		C c;
		c = new C();
		

	}

}
