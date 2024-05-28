package cooperation;

public class DrinkCoffee {

	public static void main(String[] args) {
		//	김씨는 4000원을 내고 별다방에서 아메리카노를 마셨다.
		//	이씨는 4500원을 내고 콩다방에서 라떼를 마셨다.
		
		// 이거 리턴된 텍스트 이용해서 다시한번 해보자
		
		Person kim = new Person("김씨", 100000);
		StarCoffee starCoffee = new StarCoffee();
		kim.buyStarCoffee(starCoffee, 4000);
		
		Person lee = new Person("이씨", 100000);
		BeanCoffee beanCoffee = new BeanCoffee();
		lee.buyBeanCoffee(beanCoffee, 4500);
		
		kim.showInfo();
		lee.showInfo();
		starCoffee.showInfo();
		beanCoffee.showInfo();
	}

}