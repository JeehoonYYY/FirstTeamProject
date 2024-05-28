package cooperation;

public class Subway {
	// 멤버변수
	String lineNumber;	//	노선
	int passengerCount;	//승객수
	int money;	//지하철수입
	
	//생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은 " +
					passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
