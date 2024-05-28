package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// RandomAccessFile Test
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);	//4
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());	// 4
		
		rf.writeDouble(3.14);	// 4+8
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());	// 12
		
		rf.writeUTF("안녕하세요");	//	3 * 5 + null문자(2바이트) = 17바이트
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());	// 29
		
		rf.seek(0);	// 파일포인터 위치변경
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());	// 0
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
