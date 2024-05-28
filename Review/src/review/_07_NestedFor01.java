package review;

public class _07_NestedFor01 {

	public static void main(String[] args) {
		//	별삼각형 출력하기
		int lineCnt = 7;	//	라인수
		int spaceCnt = 3;	//	공백수
		int starCnt = 1;
		
		for(int i=0; i<lineCnt; i++) {	
			for(int j=0; j<spaceCnt; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<starCnt; k++) {
				System.out.print("*");
			}
			if(i < 3) {
				spaceCnt -= 1;
				starCnt += 2;
			}else {
				spaceCnt += 1;
				starCnt -=2;
				
			}
			System.out.println();	//	개행처리
		}
	}

}
