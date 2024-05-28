package array;

public class TwoDimension {

	public static void main(String[] args) {
		// 이차원 배열 초기화하기
		
		int[][] arr = {{1, 2, 3}, 
					   {4, 5, 6}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();	// 행출력 후 한줄 띄움
		}
		
		// 알파벳 소문자를 13행 2열로 출력하는 프로그램을 이차원 배열로 구현해 보세요
		char[][] alphabets = new char[13][2];
		char ch = 'a';
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch++;
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
		}
		
		
		char[][] alphabetsTwo = new char[2][13];
		char ch2 = 'a';
		
		for(int i=0; i<alphabetsTwo.length; i++) {
			for(int j=0; j<alphabetsTwo[i].length; j++) {
				alphabetsTwo[i][j] = ch2;
				ch2++;
				System.out.print(alphabetsTwo[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("------------------------------------------------------");
		char[][] alphabets3 = new char[2][26];
		char ch3 = 'a';
		
		for(int i=0; i<alphabets3.length; i++) {
			for(int j=0; j<alphabets3[i].length; j++) {
				alphabets3[i][j] = ch3;
				ch3++;
				if(ch3 == 123) {
					ch3 = (char)(ch3 - 58); 
				}
				System.out.print(alphabets3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
