package homework;

public class Practice07 {

	public static void main(String[] args) {
		// 내가한거
//		int i, j;
//		for(i=1; i<=7; i++) {
//
//			for(j=1; j<=7; j++) {
//				if((i+j) == 8) {
//					System.out.print(j);
//				}else {
//					System.out.print(i-i);
//				}
//			}
//			System.out.println();
//		}

		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(j == (6-i)) {
					System.out.printf("%d ", 7-i);
				}else {
					System.out.printf("%d ", 0);
				}
			}
			System.out.println();
		}
		
	}

}
