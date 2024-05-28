package homework;

public class Rectangle extends Shape {
	double length;
	double width;
	
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public double calculateArea() {
		return length * width;
	}
	
}
