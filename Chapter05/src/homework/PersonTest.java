package homework;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.personAge = 40;
		person.personName = "James";
		person.isMarried = true;
		person.children = 3;
		
		System.out.println("이사람의 나이 : " + person.personAge);
		System.out.println("이사람의 이름 : " + person.personName);
		System.out.println("이사람의 결혼여부 : " + person.isMarried);
		System.out.println("이사람의 자녀수 : " + person.children);
		
	}

}
