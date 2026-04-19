package SLLL;

import java.util.LinkedList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList1 list=new LinkedList1();
		Scanner sc = new Scanner(System.in);
		
		
		int choice;
		
		do{
			System.out.println("0. Exit");
			System.out.println("1. Add Employee");
			System.out.println("2. Display All Employees");
			System.out.println("3. Search Employee By Name");
			System.out.println("4. Delete Employee by empid");
			System.out.println("5. Update salary of Employee");
			System.out.println("6. Sort Employees By salary");
			
			System.out.print("Enter your choice : ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				list.addEmployee();
				break;
				
			case 2:
				list.displayAllEmployees();
				break;
				
			case 3:
				list.searchEmpByName();
				break;
				
			case 4:
				list.deleteEmpByEmpid();
				break;
				
			case 5:
				list.updateSalary();
				break;
				
			case 6:
				list.sortEmpBySalary();
				break;
		

			}
		}
		while(choice != 0);
		
		

	}

}
