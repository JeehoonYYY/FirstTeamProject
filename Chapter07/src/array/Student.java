package array;

public class Student {
	
	private int studentNum;
	private String studentName;
	
	public Student(){}
	
	public Student(int studentNum, String studentName){
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	
	
	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void showStudentInfo() {
		System.out.println(studentNum + ", " + studentName);
	}
	
	
}
