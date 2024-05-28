package myworkshop;

import java.util.Random;

public class Lotto {
	static int randomNum;
	public static void main(String[] args) {
		for(int i=0; i<6; i++) {
			RanNum();
			System.out.printf(randomNum + " ");
		}

		
	}
	
	
	public static int RanNum() {
		// 랜덤 숫자 만들기
		Random random = new Random();
		
		// 0 이상 45 미만의 랜덤한 정수 생성
//		randomNum = random.nextInt(46);
		
		randomNum = random.nextInt(45) + 1;
		
		
		return randomNum;

	}
	

}
