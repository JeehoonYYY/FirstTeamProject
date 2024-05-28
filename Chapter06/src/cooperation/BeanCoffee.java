package cooperation;

public class BeanCoffee {
	int money;
	int beanAmericanoCnt;
	int beanLatteCnt;
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			beanAmericanoCnt++;
			return "콩다방 아메리카노를 구입하셨습니다.";
		}else if(money == Menu.BEANLATTE) {
			beanLatteCnt++;
			return "콩다방 라떼를 구입하셨습니다.";
		}else {
			return null;
		}
	}
	
	public void showInfo() {
		System.out.println("콩다방은 " + "아메리카노 " + beanAmericanoCnt + "잔, " +
				"라떼 " + beanLatteCnt + "잔을 판매하였고, 수입은 " + money + "원 입니다.");
	}
}
