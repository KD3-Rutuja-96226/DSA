package com.sunbeam;

public class SinglyLinearLinkedListMain {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.addLast(50);
		ll.addLast(60);
		ll.display();
		ll.insertBefore(40, 100);
		System.out.println("\nBefore inserting : ");
		ll.display();
		System.out.println("\nAfter Inserting : ");
		ll.insertAfter(50, 200);
		ll.display();
	}

}
