package forexample;

public class DoubleFor04 {

	public static void main(String[] args) {
/*=============================
규칙성찾기

				i	j			<=	limit = j
				초기값	조건값(limit)
1				1	
00				2
111				3
0000			4
11111			5
000000			6
1111111			7
00000000		8
111111111		9

 */

		for(int i=1; i<=9; i++) {
			int limit = i;
			for(int j=1; j<=limit; j++) {
				System.out.print(i%2);
//				if((i%2) == 1) {
//					System.out.print(1);
//				}else {
//					System.out.print(0);
//				}
				
			}
			System.out.println();
		}
	}

}
