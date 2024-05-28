package singleton;

public class CompanyTest {

	public static void main(String[] args) {
//		Company myCompany1 = new Company();		사용불가
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);	// 주소명이 같으므로 인스턴스는 1개
		
	}

}
