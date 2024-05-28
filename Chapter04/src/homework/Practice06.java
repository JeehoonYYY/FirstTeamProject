package homework;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {

		// 내가한거
//		int i, j, k;
//
//		for(i=1; i<=7; ++i) {
//			int dCnt = 4-i; // 4-i
//			if(dCnt<0) {
//				dCnt = dCnt * -1;
//			}
//			for(j=1; j<=dCnt; ++j) {
//				System.out.print(" ");
//			}
//			int sCnt;
//			
//			if(i<=4) {
//				sCnt = (2*i)-1;
//			}else {
//				sCnt = ((8-i)*2)-1;
//			}
//			
//			for(k=1; k<=sCnt; ++k) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		Scanner in = new Scanner(System.in);
		int lineCnt;
		
		
//		do {	// 일단 해!!
//			System.out.print("마름모 줄 수 입력(홀수 입력) : ");
//			lineCnt = in.nextInt();	
//		}while(lineCnt%2 == 0);	// 반복 조건
		
		while(true) {
			System.out.print("마름모 줄 수 입력(홀수 입력) : ");
			lineCnt = in.nextInt();
			if(lineCnt%2 == 1) { //반복 탈출 조건 - 정상입력값
				break;
			}else {
				System.out.println("입력값을 확인하세요!!!!");
			}
		}
		
		in.close();
		
		// 마름모 출력
	
		int spaceCnt = lineCnt/2;
		int starCnt = 1;
		
		for(int i=1; i<=lineCnt; i++) {
			if(i<=lineCnt/2+1) {	//중간라인까지
				spaceCnt = (lineCnt/2+1)-i;
				starCnt = 2*i-1;
			}else {	// 중간라인 미만
				spaceCnt = spaceCnt + 1;
				starCnt -= 2;
			}
			for(int j=1; j<=spaceCnt; j++) {
				System.out.print(" ");
			}	// $$$
			
			for(int k=1; k<=starCnt; k++) {
				System.out.print("*");
			}	//	$$$*
			System.out.println();
		}
		
	}

}
