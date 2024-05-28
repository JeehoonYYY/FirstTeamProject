package cooperation;

public class StarCoffee {
	int money;
	int starAmericanoCnt;
	int starLatteCnt;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			starAmericanoCnt++;
			return "별다방 아메리카노를 구입하셨습니다.";
		}else if(money == Menu.STARLATTE) {
			starLatteCnt++;
			return "별다방 라떼를 구입하셨습니다.";
		}else {
			return null;
		}
	}
	public void showInfo() {
		System.out.println("별다방은 " + "아메리카노 " + starAmericanoCnt + "잔, " +
				"라떼 " + starLatteCnt + "잔을 판매하였고, 수입은 " + money + "원 입니다.");
	}
}
