package singleton;

public class CarFactory {
	
	// 인스턴스
	private static CarFactory instance = new CarFactory();
	
	//생성자
	private CarFactory() {}
	
	//메서드
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}

	public Car createCar() {
		return new Car();
		
	}
	
	
	
	
}
