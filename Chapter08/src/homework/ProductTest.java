package homework;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
		
//		Product aaa = new Product("새우깡", "농심(주)", 1900);
//		Product bbb = new Product("빼빼로", "롯데제과", 2200);
//		Product ccc = new Product("먹태깡", "농심(주)", 2500);
	
//		System.out.println("[출고 리스트]");
//		aaa.showInfo();
//		bbb.showInfo();
//		ccc.showInfo();
//		System.out.println("---------------------------------");
//		System.out.println("출고 상품 : " + Product.productNum + "건");

		ArrayList<Product> productList = new ArrayList<Product>();
		Product aaa = new Product("새우깡", "농심(주)", 1900);
		Product bbb = new Product("빼빼로", "롯데제과", 2200);
		Product ccc = new Product("먹태깡", "농심(주)", 2500);
		productList.add(aaa);
		productList.add(bbb);
		productList.add(ccc);
		
		
		System.out.println("[출고 리스트]");
		for(Product product : productList) {
			System.out.println(product.getSerialNum() + ".  " + product.getProductName() + "   " + product.getFactoryName() + "   " + product.getPrice());
		}
		System.out.println("---------------------------------");
		System.out.println("출고 상품 : " + Product.productNum + "건");
		
		
		
	}			
}
