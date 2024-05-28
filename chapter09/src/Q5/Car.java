package Q5;

public  class Car {
	public  void start() {
		System.out.println("시동을 켭니다.");
	};
	public  void drive() {
		System.out.println("달립니다.");
	};
	public  void stop() {
		System.out.println("멈춥니다.");
	};
	public  void turnOff() {
		System.out.println("시동을 끕니다.");
	};
	
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
	}
	
	
}
