package alone;

class MyDate{
	int day, month, year;
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	// 여기에 코드를 작성하세요
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate Myd = (MyDate)obj;
			return (this.day == Myd.day && this.month == Myd.month && this.year == Myd.year);
		}
		return false;
	}
	
	// 여기에 hashcode() 재정의해보세요
	@Override
	public int hashCode() {
		return year*10000 + month*100 + day;
	}
	
}


public class MyDateTest {

	public static void main(String[] args) {
		// equals 재정의 연습
		// 날짜구현클래스에서 날짜가 같으면 
		// true가 되도록 equals메서드 재정의 하세요
		
		MyDate date1 = new MyDate(20, 5, 2024);
		MyDate date2 = new MyDate(20, 5, 2024);
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		
		
		System.out.println(date1.hashCode() == date2.hashCode());	// true

	}

}
