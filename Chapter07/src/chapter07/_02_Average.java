package chapter07;

public class _02_Average {

	public static void main(String[] args) {
		// 배열 이용 평균 구하기
		
//		for(int i=0; i<10; i++) {
//			System.out.println((int)(Math.random() * 51)+50);
//			 0 + 50, 50 + 50
//			System.out.println((int)(Math.random() * 3) + 1);
//			 0+1, 2+1 => 1, 2, 3
//			 더하기 값을 시작값 최대값은 = (더하기값 + 곱하기값) -1
//			 곱하기값 = 100 - 50 + 1 최대값 - 더하기값 + 1
//		}

		
		int[] num = new int[100];
		int total = 0;
		
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 10);		// 0 ~ 9
			System.out.printf("%4d", num[i]);
			total += num[i];	// 저장된 정수를 누적
//			if(i==9 || i==19 || i==29) {
			if(i%10 == 9) {
				System.out.println();
			}
		}
		System.out.println("\n정수 " + num.length + "개의 평균은 " + 
						(double)total/num.length + "입니다.");
	}

}
