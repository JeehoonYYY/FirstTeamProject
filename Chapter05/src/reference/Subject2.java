package reference;

public class Subject2 {	// 이건 Subject2야
	String SubjectName;	// 문자열 SubjectName 쓸거야
	int scorePoint;		// int형 scorePoint 쓸거야
	
	public String getSubjectName() {	//이건 메소드야 / 메소드이름이 getSubjectName이야
		return SubjectName;				//이 메소드는 위에서 선언한 SubjectName을 반환할거야
	}
	public void setSubjectName(String subjectName) {	// 이건 메소드야 / 이름이 setSubjectName이야
		// 문자열 타입의 subjectName을 입력받을거야
		SubjectName = subjectName;	//입력받은 subjectName을 위에서 선언한 SubjectName에 넣을거야
	}
	public int getScorePoint() {	// 이건 메소드야 / 메소드 이름이 getScorePoint야
		return scorePoint;			// 이 메소드는 선언한 scorePoint를 반환할거야
	}
	public void setScorePoint(int scorePoint) {	// 이건 메소드야 / 이름이 setScorePoint야
												// 정수형 scorePoint를 입력받을거야
		this.scorePoint = scorePoint;			// 입력받은 scorePoint를 scorePoint에 넣을거야
	}
	
	
}
