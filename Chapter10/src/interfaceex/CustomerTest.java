package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		// 인터페이스 형변환 실습
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.Buy();
		buyer.order();
		
		Sell seller = customer;
		seller.Sell();
		seller.order();
		
		customer.order();
		
//		System.out.println();
//		if(seller instanceof Customer) {
//			Customer cust = (Customer)seller;
//			cust.Buy();
//			cust.Sell();
//		}
//
//		if(buyer instanceof Customer) {
//			Customer cust2 = (Customer)buyer;
//			cust2.Buy();
//			cust2.Sell();
//		}
	}

}
