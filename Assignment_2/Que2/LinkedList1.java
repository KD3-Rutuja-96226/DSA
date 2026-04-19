package SLLL;

import java.util.Scanner;

public class LinkedList1{
	public class Node{
		Employee emp;
		private Node next;
		
		public Node (Employee emp){
			this.emp = emp;
			next = null;
		}
	}
	
	private Node head;
	
	public LinkedList1() {
		head = null;
	}
	
	public void addEmployee() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name :");
		String name = sc.next();
		System.out.print("Enter EmpId:");
		int empid = sc.nextInt();
		System.out.print("Enter Salary :");
		double salary = sc.nextDouble();
		Employee emp=new Employee(name,empid,salary);
		Node newnode = new Node(emp);
		
		if(head == null)
			head = newnode;
		
		else {
			newnode.next = head;
			head = newnode;
		}
		System.out.println("Employee Added Successfully");
	}
	
	public void displayAllEmployees() {
		Node trav = head;
		
		if(trav == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("List : ");
		while(trav != null) {
			System.out.printf("Name : %-15s ID : %-10d Salary : %.2f%n", trav.emp.getName(), trav.emp.getEmpid(), trav.emp.getSalary());
			trav = trav.next;
		}
		
	}
	
	public void searchEmpByName() {
		Node trav = head;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Name :");
		String name = sc.next();
		
		if(head == null) {
			System.out.println("List is Empty...");
			return;
		}
		
		while(trav != null) {
			if(trav.emp.getName().equals(name)) {
				System.out.println("Employee Found...");
				System.out.printf(trav.emp.toString());
				return;
			}
			trav = trav.next;
		}
		System.out.println("Employee not found...");
	}
	
	public void deleteEmpByEmpid() {
		Node trav = head;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Emp ID :");
		int empid = sc.nextInt();
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		if(head.emp.getEmpid() == empid) {
			head = head.next;
			return;
		}
		
		while(trav.next != null) {
			if(trav.next.emp.getEmpid() == empid) {
				trav.next = trav.next.next;
				return;
			}
			trav = trav.next;
		}
		System.out.println("Employee not found...");
	}
	
	public void updateSalary() {
		Node trav = head;
		
		if(head == null) {
			System.out.println("List is Empty...");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid to update salary :");
		int empid = sc.nextInt();
		System.out.print("Enter updated saalry :");
		double salary = sc.nextDouble();
		
		
		while(trav != null) {
			
			if(trav.emp.getEmpid() == empid) {
				trav.emp.setSalary(salary);
				System.out.println("Salary updated sucesfullly");
				return;
			}
				trav = trav.next;
		}
		System.out.println("Employee not found...");
	}
	
	public void sortEmpBySalary() {
		Node trav = head;
		while(trav != null) {
			Node trav1 = trav.next;
			while(trav1 != null) {
				if(trav.emp.getSalary() > trav1.emp.getSalary()) {
					Employee temp = trav.emp;
					trav.emp = trav1.emp;
					trav1.emp = temp;
				}
				trav1 = trav1.next;
			}
			trav = trav.next;
		}
		
	}	
}













