package Homework;

public class FinalExam {

	public static void main(String[] args) {
//		내가 한거
//		int korean = 90;
//		int english = 85;
//		int math = 75;
//		char grade ='B';
//		int sum = korean + english + math;
//		float average = sum / 3.0f;
//		System.out.printf("국어 : %d점\n", korean);
//		System.out.printf("영어 : %d점\n", english);
//		System.out.printf("수학 : %d점\n", math);
//		System.out.printf("총점 : %d\n", sum);
//		System.out.printf("평균 : %.2f\n", average);
//		System.out.printf("등급 : %c\n", grade);
		
		int korean = 90;
		int english = 85;
		int math = 75;
		
		int sum;
		double mean;
		char grade = 'B';
		
		sum = korean + english + math;
		mean = sum / 3.0;
		
		System.out.printf("국어: %d점\n영어: %d점\n수학: %d점\n총점: %d점\n평균: %.2f점\n등급: %c",
				korean, english, math, sum, mean, grade);
	}

}
