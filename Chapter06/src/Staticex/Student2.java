package Staticex;

public class Student2 {
	//	static 변수는 인스턴스 생성과 상관없이 먼저 생성됨
	//	클래스 메서드 : 인스턴스 생성과 상관없이 먼저 생성됨
	public static int serialNum = 1000;	// 클래스변수
	
	//	멤버변수 = 인스턴스 변수
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		// 학생이 생성될 때마다 일련번호 증가
		serialNum = serialNum + 1;	// serialNum++;
		studentID = serialNum; //	증가된 값을 학번 인스턴스변수에 대입
	}
	// 메서드
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	//	static 메서드 = 클래스 메서드
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
