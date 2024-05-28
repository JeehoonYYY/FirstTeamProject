package myworkshop;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		String newId;
		String newUserName;
		String id;
		String userName;
		int main;
		
		Scanner in = new Scanner(System.in);
		System.out.println("1 : 로그인");
		System.out.println("2 : 회원가입");
		System.out.print("1번 또는 2번을 입력하세요 : ");
		main = in.nextInt();
		in.nextLine();
		
		if(main == 1) {
			System.out.println("ID와 이름을 입력하세요");
			System.out.print("ID : ");
			id = in.nextLine();
			System.out.print("이름 : ");
			userName = in.nextLine();
		}else {
			System.out.println("ID와 이름을 입력하세요");
			System.out.print("ID : ");
			newId = in.nextLine();
			System.out.print("이름 : ");
			newUserName = in.nextLine();
		}


		in.close();
		
	}

}
