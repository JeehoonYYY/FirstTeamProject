package homework;

public class Practice04 {

	public static void main(String[] args) {
		// 
		int i;
		double fa;
		for(i=0; i<=100; i=i+5) {
			fa = (i*1.8)+32;
			System.out.printf("%-10d => %-10.2f\n", i, fa);
		}
	}

}
