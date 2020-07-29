package Collection_demo;

import java.util.LinkedList;

public class Linkedlist_Demo {

	public static void main(String[] args) {
		LinkedList <Double> MyLinkedList = new LinkedList<>();

		MyLinkedList.add(38.2);
		MyLinkedList.add(46.3);
		MyLinkedList.add(25.5);//same value
		MyLinkedList.add(25.5);//duplication allow
		MyLinkedList.add(24.8);
		MyLinkedList.add(0,88.7);
		MyLinkedList.remove(1);
	
		for(Double d:MyLinkedList)
	System.out.println(d);
	}

}
