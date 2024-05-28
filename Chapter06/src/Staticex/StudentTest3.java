package Staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		//	클래스이름으로 static변수 참조하기
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이순신");
		//	serialNum 변수를 직접 클래스이름으로 참조가능
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);
		
		Student1 studentHong = new Student1();
		studentHong.setStudentName("홍길동");
		System.out.println(Student1.serialNum);
		System.out.println(studentHong.studentName + " 학번: " + studentHong.studentID);
		
		
	}

}
