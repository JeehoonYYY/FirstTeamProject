package homework;

public class Trapezoid extends ShapeTest {
	double base1, base2, height;
	
	Trapezoid(double base1, double base2, double height){
		this.base1 = base1;
		this.base2 = base2;
		this.height = height;
	}
	
	public Object calculateArea() {
		return 0.5 * (base1 + base2) * height;
	}}
