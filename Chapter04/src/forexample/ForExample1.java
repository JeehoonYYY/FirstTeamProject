package forexample;

public class ForExample1 {

	public static void main(String[] args) {
		// for문 예제
		int i;
		
//		for(초기식, 조건식, 증감식) {
//			반복 실행문;
//		}
		
		for(i=1; i<=10; i++) {	//증감식 : i += 1, ++i, i=i+1
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("i값 : " + i);
		
		
		//10부터 1씩 감소하면서 0까지 출력
		for(i=10; i>=0; --i) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("i값 : " + i);
		
		// 0부터 90까지 10씩 증가하며 출력
		for(i = 0; i<=90; i+=10) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		// 0부터 10까지 3의배수 출력

		for(i=3; i<=10; i+=3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/* i   끝값 : i+9
		  1 ~  10
		 11 ~  20
		 21 ~  30
		 .
		 .
		 .
		 91 ~ 100
		 */
		for(i=1; i<=91; i+=10) {
			//System.out.println(i + " ~ " + (i+9));
			System.out.printf("%3d ~ %3d\n",i, i+9);
		}
		
		
		/*
		 2 * 1 = 2
		 2 * 2 = 4
		 2 * 3 = 6
		 .
		 .
		 .
		 2 * 9 = 18
		 */
		for(i=1; i<=9; ++i) {
			System.out.printf("2 * %d = %2d\n", i, (2*i));
		}
		
		
		
		// 합계를 구할 변수
		int sum = 0;
		// 100 ~ 500까지의 합계는 []입니다.(1씩증가)
		
		for(i=100; i<=500; i++) {
			sum = sum + i;
		}
		System.out.printf("100 ~ 500까지의 합계는 %3d입니다.\n", sum);
		
		// 1 ~ 100 까지의 범위에서 3의 배수의 합계는 %d입니다.\n
		int sum1 = 0;
		int totalCnt = 0;
		for(i=3; i<=100; i+=3) {	// 3의 배수이며
			if(i%2 != 0) {	// 2의 배수가 아닌 수의 개수와 합계는
				System.out.print(i + " ");
				sum1 += i;
				totalCnt++;
			}
		}
		System.out.println();
		System.out.printf("1 ~ 100 까지의 범위에서 3의 배수, 2의 배수가 아닌 수의 합계는 %d입니다.\n", sum1);
		System.out.printf("1 ~ 100 까지의 범위에서 3의 배수, 2의 배수가 아닌 수의 개수는 %d입니다.\n", totalCnt);
		
	}

}
