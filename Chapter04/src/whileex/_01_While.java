package whileex;

public class _01_While {

	public static void main(String[] args) {
		// while문과 do~while문
		int i = 1;	// 초기값
		
//		while(조건) {
//			실행 명령문;
//		}
		while(i <= 100) {	//조건식
			System.out.print(i + " ");
			i++;	// i = i + 1, i += 1 증감식
		}
		System.out.println();
		
		i = 1;
		do { // 자 일단 해봐
			System.out.print(i + " ");		// 이거를
			i++;
		}while(i <= 100);	// 여기까지
		
	}

}
