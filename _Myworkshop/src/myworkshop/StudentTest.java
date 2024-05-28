package myworkshop;

public class StudentTest {
	public static void main(String[] args ) {
		
		Student studentLee = new Student("이씨");
		Student studentKim = new Student("김씨");
		
		
		studentLee.setKoreanScore(70);
		studentLee.setMathScore(100);
		studentKim.setKoreanScore(80);
		studentKim.setMathScore(60);
		
		studentLee.showInfo();
		studentKim.showInfo();
		
		
	}
}
