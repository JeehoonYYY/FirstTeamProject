package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void Sell() {
		System.out.println("판매하기");
		
	}

	@Override
	public void Buy() {
		System.out.println("구매하기");
	}
	
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
	
}
