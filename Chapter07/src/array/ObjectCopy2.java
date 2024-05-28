package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		//	배가 너무 고픕니다.
		//	점심은 언제 먹습니까.
		
		//	객체배열복사는 static과 같은가본데요?!
		
		//	객체 배열 복사하기
		//	얕은 복사라고 부름(주소값만 복사함)
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백", "조정래");
		bookArray1[1] = new Book("데미안", "헤세");
		bookArray1[2] = new Book("어떻게", "유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		//	대상배열 출력
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		//	원본배열 수정
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ===");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=== bookArray2 ===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
	}

}
