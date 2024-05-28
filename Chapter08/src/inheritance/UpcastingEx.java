package inheritance;

public class UpcastingEx {

	public static void main(String[] args) {
		// 업캐스팅 예제, 가시성 확인
		Person person;
		Student student = new Student("이제문");
		person = student;	// 업캐스팅
		
		System.out.println(person.name);	// 오류없음
		
		// person.grade = "1학년";	// 컴파일오류
		// person.department = "computer";	// 컴파일오류
		
		
	}

}
