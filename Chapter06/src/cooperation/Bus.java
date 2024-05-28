package cooperation;

public class Bus {
	//	멤버변수
	int busNumber;	//버스번호
	int passengerCount;	//승객수
	int money;	//버스수입
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	//메서드
	public void take(int money) {
		//	승객이 버스에 탄 경우
		this.money += money;	//버스 수입증가
		passengerCount++;	//승객수 증가
	}
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " +
					passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
