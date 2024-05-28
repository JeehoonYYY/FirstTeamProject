package exception;

public class AutoCloseObjTest {

	public static void main(String[] args) {
		// try-with-resources문과 강제예외발생
		// java9에서 추가된 문법
		AutoCloseObj obj = new AutoCloseObj();
		try(obj){
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}

}
