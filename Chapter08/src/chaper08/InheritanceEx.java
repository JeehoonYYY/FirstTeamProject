package chaper08;

import chaper08.instanceofex.Student;

public class InheritanceEx {

	public static void main(String[] args) {
		// 접근제어자 연습
		Student student = new Student();	// 마지막 A는 생성자임
		student.set();
		System.out.println(student.getWeight());
		System.out.println(student.age);
		System.out.println(student.height);
		System.out.println(student.name);

	}

}
