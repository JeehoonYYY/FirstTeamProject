package Homework;

public class SalaryCalc {

	public static void main(String[] args) {
/*		내가 한거

		double actualSalary = 1500000 * 0.9 + 700000;
		
		System.out.printf("홍길동군의 실급여액은 %.0f원 입니다.", actualSalary);
*/	
		int salary = 1500000;
		int bonus = 700000;
		double realMoney;
		
		realMoney = (salary * 0.9) + bonus;
		
		System.out.printf("홍길동군의 실급여액은 %.0f원 입니다.", realMoney);
		
	}

}
