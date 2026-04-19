/*2. In singly linear linked list implement following operations. i. insert a new node after a given data ii.
insert a new node before a given data*/

package com.sunbeam;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
		}
	}
	private Node head;
	public LinkedList() {
		head = null;
	}
	public void addFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			return;
		}
		Node trav = head;
		while(trav.next != null) {
			trav = trav.next;
		}
		trav.next = newNode;
	}
	public void insertBefore(int target, int value) {
		Node newNode = new Node(value);
		if(head == null) {
			return;
		}
		if(head.data == target) {
			 addFirst(value);
			 return;
		}
		else {
			Node trav = head;
			while(trav.next != null && trav.next.data != target) {
				trav = trav.next;
			}
			if(trav.next != null) {
				newNode.next = trav.next;
				trav.next = newNode;
			}
			else {
				System.out.println("Value not Found.");
			}
		}
		
	}
	public void insertAfter(int target, int value) {
		Node newNode = new Node(value);
		if(head == null) {
			return;
		}
		if(head.data == target) {
			 addLast(value);
			 return;
		}
		else {
			Node trav = head;
			while(trav != null && trav.data != target) {
				trav = trav.next;
			}
			if(trav != null) {
				newNode.next = trav.next;
				trav.next = newNode;
			}
			else {
				System.out.println("Value not Found.");
			}
		}
	}
	public void display() {
			Node trav = head;
			while(trav != null) {
				System.out.print(trav.data+" ");
				trav = trav.next;
			}
		
	}
}
