package homework;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/*************************
		 [급여 상세]
		 	시간 당 급여(TIME_PAY) : 1000원, 아간 근무 시 : 시간 당 급여 * 1.5
		 	근무 시간을 입력 받아 급여를 출력 하시오.
		 [출력 예]
		 	월 총 근무 시간(workHour): 100
		 	주간 근무 시 '1', 야간 근무 시 '2' 입력 : 2 -> timePayRate
		 	당신의 이번 달 총 급여는 1500000원 입니다.
		 	
		 	총급여(salary) = TIME_PAY * workHour * timePayRate
		 *************************/
		final int TIME_PAY = 10000;
		int workType = 1; // 근무형태
		double workHour, timePayRate, salary;
		Scanner in = new Scanner(System.in);
		System.out.print("월 총 근무 시간: ");
		workHour = in.nextDouble();
		System.out.print("주간 근무 시 1, 야간 근무 시 2 입력 : ");
		workType = in.nextInt();
		in.close();
		
		timePayRate= (workType == 1) ? 1 : 1.5;
		salary = (TIME_PAY * timePayRate) * workHour;
		//총급여 = (시간당급여 * 급여비율) * 총시간
		
		System.out.printf("당신의 이번 달 총 급여는 %.0f원 입니다.", salary);
		
		
		
		
		// 내가한거
//		final int HOUR = 10000;
//		int day, hour;
//		double pay;
//		Scanner in = new Scanner(System.in);
//		System.out.print("월 총 근무시간 : ");
//		hour = in.nextInt();
//		System.out.print("주간 근무시 '1', 야간 근무시 '2' 입력 : ");
//		day = in.nextInt();
//		in.close();
//		
////		if(day == 1) {
////			pay = hour * HOUR * 1;
////		}else {
////			pay = hour * HOUR * 1.5;
////		}
//		
//		pay = (day == 1) ? (hour * HOUR * 1) : (hour * HOUR * 1.5);
//		System.out.println("당신의 이번 달 총 급여는 " + (int)pay + "원 입니다.");
		
		
	}

}
