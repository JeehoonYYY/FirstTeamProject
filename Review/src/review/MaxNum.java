package review;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		// 3개의 정수를 연속으로 입력 받아 세 수중 가장
		// 큰수를 리턴하는 메서드를 정의해 보시오 
		int x, y, z;
		Scanner in = new Scanner(System.in);
		System.out.print("3개의 정수를 입력(공백 구분) : ");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		System.out.printf("세 수 중 가장 큰 수는 %d\n", getLargeNum(x, y, z));
		
		in.close();

	}
	
	public static int getLargeNum(int a1, int a2, int a3) {
		int largeNum = a1;
		if(largeNum > a2) {
			if(largeNum > a3) {
				return largeNum;
			}else {
				largeNum = a3;
				return largeNum;
			}
		}else {
			largeNum = a2;
			if(largeNum > a3) {
				return largeNum;
			}else {
				largeNum = a3;
				return largeNum;
			}
		}
		
	}
}


