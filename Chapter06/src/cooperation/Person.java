package cooperation;

public class Person {
	String personName;
	int money;
	
	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee starcoffee, int money) {
		starcoffee.brewing(money);
		this.money -= money;
	}
	public void buyBeanCoffee(BeanCoffee beancoffee, int money) {
		beancoffee.brewing(money);
		this.money -= money;
	}
	
	public void showInfo() {
		System.out.println(personName + "님은 " +  + + money + "입니다.");
		System.out.println();
	}

		
}
