package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 제네릭 프린터 테스트
		GenericsPrinter<Powder> powderPrinter = new GenericsPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();	// 명시적으로 형변환을 하지 않음
//		System.out.println(powderPrinter);
		powderPrinter.printing();
		
		GenericsPrinter<Plastic> plasticPrinter = new GenericsPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
//		System.out.println(plastinPrinter);
		plasticPrinter.printing();
//		GenericsPrinter<Water> printer = new GenericsPrinter<Water>();
		
		
	}

}
