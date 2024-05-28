package reference;

public class Student4 {
	//	멤버변수
	int studentID;	//	int형 sutdentID 라는게 있어
	String studentName;	//	문자열 studentName 라는게 있어
	
	//	참조자료형
	Subject2 korean;	// (참조자료)Subject2형 korean이라는게 있어. Subject2는 
	Subject2 math;		//	가서 확인해봐
	

	
	//	생성자
	public Student4(int id, String name) { // public 클래스명(){}	<<<	생성자 기본
								// Student4 클래스의 생성자아 int형 id변수, 문자열 name변수 입력받을거야
		studentID = id;			//	id는 studentID에 넣을거야
		studentName = name;		// name은 studentName에 넣을거야
		
		korean = new Subject2();	// korean 변수는 Subject2를 참조하고 이제 쓸거야(아직 비어있음) 
		math = new Subject2();		// mateh 변수는 Subject2를 참조하고 이제 쓸거야(아직 비어있음)
	}
	
	//	메서드
	public void setKorean(String name, int score) { // 이름이 setKorean이라는 메서드야 / name, score입력받아
		korean.setSubjectName(name);
		// 입력받은 name을 korean에 setSubjectName(subject2참조-subjectName에 넣어) 메서드를 사용해 
		korean.setScorePoint(score);
		// 입력받은 score를 korean에 setScorePoint(subject2참조-scorePoint에 넣어) 메서드를 사용해
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	public void showStudentInfo() { // 이름이 showStudentInfo라는 메서드야
		int total = korean.getScorePoint() + math.getScorePoint();	// 이건 total변수에 korean, math 점수를 반환해서 더해
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다."); // 출력
	}
}
