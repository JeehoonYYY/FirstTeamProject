package array;

public class ObjectCopy1 {

	public static void main(String[] args) {
		//	배가 너무 고픕니다.
		//	점심은 언제 먹습니까.
		//	객체 배열 복사하기
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백", "조정래");
		bookArray1[1] = new Book("데미안", "헤세");
		bookArray1[2] = new Book("어떻게", "유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		for(int i=0; i<bookArray1.length; i++) {
			System.out.println(bookArray1[i]);
		}
		for(int i=0; i<bookArray2.length; i++) {
			System.out.println(bookArray2[i]);
		}
	}

}
