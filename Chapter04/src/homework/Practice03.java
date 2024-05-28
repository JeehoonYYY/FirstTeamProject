package homework;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		
		
//		내가 한거
//		int score;
//		Scanner in = new Scanner(System.in);
//		System.out.print("점수 입력 : ");
//		score = in.nextInt();
//		in.close();
//		
//		if(score <= 100 && score >= 0) {
//			if(score >= 90) {
//				System.out.println("[90점 이상 : A등급]");
//			}else if(score >= 80) {
//				System.out.println("[80점 이상 : B등급]");
//			}else if(score >= 70) {
//				System.out.println("[70점 이상 : C등급]");
//			}else if(score >= 60) {
//				System.out.println("[60점 이상 : D등급]");
//			}else{
//				System.out.println("[60점 미만 : F등급]");
//			}
//			
//		} else {
//			System.out.println("잘못된 점수 입력");
//		}
		
		
		int score;
		char level;
		System.out.print("점수 입력 : ");
		Scanner in = new Scanner(System.in);
		score = in.nextInt();
		in.close();
		
		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				level = 'A';
			}else if(score>=80) {
				level = 'B';
			}else if(score>=70) {
				level = 'C';
			}else if(score>=60) {
				level = 'D';
			}else {
				level = 'F';
			}
			
			if(level == 'F') {
				System.out.printf("[60점 미만 : %c등급]", level);
			}else {
				if(score == 100) {
					System.out.printf("[90점 이상 : %c등급]", level);
				}else {
					System.out.printf("[%d점 이상 : %c등급]", (score/10)*10, level);
				}
				
			}
		}else {
			System.out.println("잘못된 점수 입력");
		}
		
		
	}

}
