package constructor;

public class PersonTest {

	public static void main(String[] args) {
		// 생성자 실습
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5f;
		personKim.height = 180.0f;
		
		Person personLee = new Person("이순신", 175, 75);
		
		//	생성자 오버로딩
		Person personKang = new Person("강감찬");
		
		
	}

}
