package homework;

public class Dododo3 {

	public static void main(String[] args) {
		
		int i, j, k;
		i = 13;
		k = 0;
		for(i=1; ; ++i) {
			
		
		for(j=2; j<i; ++j) {
			if(i%j == 0) {
				break;
			}else if(j == i-1) {
				k = k + 1;
				System.out.println(i + " " + k);
				break;
			}
			
		}
		}
		
	}

}
