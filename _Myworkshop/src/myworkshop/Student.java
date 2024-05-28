package myworkshop;

public class Student {
	
	String name;
	Subject korean, math;
	static int ID = 1000;
	int id;
	
	Student(String name){
		this.name = name;
		this.ID++;
		id = this.ID;
		korean = new Subject();
		 math = new Subject();
	}
	
	public void setKoreanScore(int koreanScore){
		korean.setKoreanScore(koreanScore);
	}
	public void setMathScore(int mathScore) {
		math.setMathScore(mathScore);
	}
	
	
	public void showInfo() {
		System.out.println(name + id);
		System.out.println("국어 : " + korean.getKoreanScore());
		System.out.println("수학 : " + math.getMathScore());
	}

}
