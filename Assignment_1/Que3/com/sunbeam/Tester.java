package com.sunbeam;

public class Tester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements (in random order)
        list.insertSorted(30);
        list.insertSorted(10);
        list.insertSorted(20);
        list.insertSorted(25);
        list.insertSorted(5);

        // Display sorted list
        System.out.println("Sorted Linked List:");
        list.display();
    }
}
