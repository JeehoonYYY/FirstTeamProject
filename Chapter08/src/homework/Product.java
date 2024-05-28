package homework;

public class Product {
	
	static int productNum;
	private static int slNum = 1199;
	private String productName;
	private String factoryName;
	private int price;
	private int serialNum;
	

	
	Product(String productName, String factoryName, int price){
		this.productName = productName;
		this.factoryName = factoryName;
		this.price = price;
		slNum++;
		serialNum = slNum;
		productNum++;
	}


	public String getProductName() {
		return productName;
	}


	public String getFactoryName() {
		return factoryName;
	}


	public int getPrice() {
		return price;
	}


	public static int getProductNum() {
		return productNum;
	}

	
	public int getSerialNum() {
		return serialNum;
	}


	public void showInfo() {
		System.out.println(getSerialNum() + ".  " + getProductName() + "   " + getFactoryName() + "   " + getPrice());
	}
	
	
	
	
	
}

