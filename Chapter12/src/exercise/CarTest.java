package exercise;

import java.util.HashMap;

class Car{
	String name;
	// 생성자
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
}
// HashMap을 사용하여 CarFactory 클래스를 구핸해보세요 <key, value>
class CarFactory {
	private static CarFactory instance = new CarFactory();
	HashMap<String, Car> carMap = new HashMap<>();
	
	private CarFactory() {}
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	public Car createCar(String name) {
		// 핵심
		if(carMap.containsKey(name)) {
			// 존재하면 해당 키값에 해당하는 인스턴스 주소 반환
			return carMap.get(name);
		}
		// 해당 맵에 없으면 인스턴스 생성 후 리턴
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}
	
}
public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();	// 싱글톤
		// Car car = new Car();
		Car sonata1 = factory.createCar("연수차");
		// new Car() HashMap<String, Car>
		// containsKey("연수차" : 존재하면 get("연수차") 없다면 put("연수차", new Car())
		Car sonata2 = factory.createCar("연수차");
		System.out.println(sonata1 == sonata2);  // true
		// 해시맵에 키값이 "연수차" 키값으로 value에 인스턴스 저장
		
		Car avante1 = factory.createCar("승연차");
		Car avante2 = factory.createCar("승연차");
		System.out.println(avante1 == avante2);	// true
		
		System.out.println(sonata1 == avante1);	// false
		
	}

}
