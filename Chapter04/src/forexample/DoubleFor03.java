package forexample;

public class DoubleFor03 {

	public static void main(String[] args) {
/*=============================
규칙성찾기

		i	j			<=	limit
			초기값	조건값(limit)
12345	1	1		5	=	1	+	4	
23456	2	2		6	=	2	+	4
34567	3	3		7	=	3	+	4
45678	4	4		8
56789	5	5		9
 * 
 */

		for(int i=1; i<=5; i++) {
			int limit = (i+4);
			for(int j=i; j<=limit; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
