package forexample;
/*
 				i	$		dCnt(5-i)		* 별개수 sCnt
 		 		
$$$$*			1	4	=	5 - i			1	=	(2*i)-1
$$$***			2	3	=	5 - i			3
$$******		3	2	=	5 -	i			5
$********		4	1						7
**********		5	0						9

 */ 

public class DoubleForStar03 {

	public static void main(String[] args) {
		int dCnt = 4;
		int sCnt = 1;
		
		for(int i=1; i<=5; i++) {
			dCnt = 5-i;
			sCnt = (2*i)-1;
			for(int j=1; j<=dCnt; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=sCnt; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
