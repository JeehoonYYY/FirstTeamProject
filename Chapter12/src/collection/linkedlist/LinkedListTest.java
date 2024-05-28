package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// LinkedList Test하기
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		

		myList.add(1, "D");	// A, D, B, C
		// 맨앞에
		System.out.println(myList);
		myList.addFirst("O");	// O, A, D, B, C
		System.out.println(myList);
		
		myList.removeLast();	// O, A, D, B
		System.out.println(myList);
	}

}
