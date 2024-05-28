package myworkshop;

import java.util.Random;
import java.util.Scanner;

public class Game01 {
	static int randomNum;
	public static void main(String[] args) {
		// 간단한 난수 추측 게임: 컴퓨터가 1부터 100 사이의 난수를 생성하고,
		//	사용자가 이를 추측하여 맞히는 게임을 만들어보세요.
		//	사용자가 입력한 숫자가 정답과 비교하여
		//	"큰 수입니다" 또는 "작은 수입니다" 메시지를 표시합니다.
		RanNum();
		
		Scanner in = Scanner.in(System.in);
		System.out.println("1 - 100까지의 숫자를 입력하세요 : ");
		int num = in.nextInt();
		if
		in.close();
		
		
		System.out.println(randomNum);
		
		
		
	}
	
	public static int RanNum() {
		Random random = new Random();
		
		randomNum = random.nextInt(101) + 1;
		return randomNum;
	}
	
	

}
