package homework;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		
		//	내가 한거
//		int i, k;
//		int j = 3;
//		for(i=1; i<=4; ++i) {
//			int dCnt = 4-i;
//			for(j=1; j<=dCnt; ++j) {
//				System.out.print(" ");
//			}
//			int sCnt = (i*2)-1;
//			for(k=1; k<=sCnt; ++k) {
//				System.out.print("*");		
//			}
//			System.out.println();
//		}

		
		Scanner in = new Scanner(System.in);
		System.out.print("별라인수 입력 : ");
		int lineCnt = in.nextInt();
		in.close();
		
		int dCnt = lineCnt - 1;
		int starCnt = 1;
		
		for(int i=1; i<=lineCnt; i++) {
			//공백찍기
			for(int j=1; j<=dCnt; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=starCnt; k++) {
				System.out.print("*");
				
			}
			
			// 중요	달러나 별을 찍는 갯수의 변화줄수 있음==========
			dCnt = dCnt - 1;
			starCnt = starCnt + 2;
			// ==========================================
			System.out.println();
		}
		
		
		
	}

}
