package review;

public class _01_TypeConversion {

	public static void main(String[] args) {
		//	타입 변환 이해를 위한 예제
		System.out.println(10/4);
		System.out.println(10/4.0);
		System.out.println((char)0x12340041);	//	4byte -> 2byte / 0x0041 -> 65 / 65의 문자형 대문자A
		byte b = 0;	// 1바이트는 -128 ~ 127	-128 -127 -126 -127
		b = (byte)227;					//	 128  129  130  131
		System.out.println(b);
		System.out.println((int)2.9 + 1.8);	// 2 + 1.8 = 3.8
		System.out.println((int)(2.9 + 1.8));	// (int)4.7 = 4
		
	}

}
