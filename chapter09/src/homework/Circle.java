package homework;

public class Circle extends ShapeTest {
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}

	public Object calculateArea() {
		return Math.PI * radius * radius;
	}
	
	
}
