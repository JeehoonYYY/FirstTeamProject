package homework;

public class Dododo {

	public static void main(String[] args) {

		int i, j, k;
		for(i=10; i>=1; --i) {
			
			for(j=i; j>=i-10 ; --j) {
				System.out.printf("%2d", j);
			}
			System.out.println();
		}
	
	}

}
