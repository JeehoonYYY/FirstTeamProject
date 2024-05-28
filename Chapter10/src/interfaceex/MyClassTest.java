package interfaceex;

public class MyClassTest {

	public static void main(String[] args) {
		// 상속받은 인터페이스 구현한 MyClass실습
		MyClass mClass = new MyClass();
		
		X xclass = mClass;
		xclass.x();
		
		Y yclass = mClass;
		yclass.y();
		
		MyInterface iclass = mClass;
		iclass.x();
		iclass.y();
		iclass.myMethod();
	}

}
