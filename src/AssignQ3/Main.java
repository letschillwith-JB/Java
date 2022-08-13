package AssignQ3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Member manager = new Manager();
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter Details of Manager: ");
//		System.out.println("Enter Name : ");
//		manager.name = sc.nextLine();
//		
//		System.out.println("Enter age : ");
//		manager.age = sc.nextInt();
//		
//		System.out.println("Enter Phone Number : ");
//		manager.phone_Number = sc.next();
//		
//		System.out.println("Enter Address : ");
//		manager.address = sc.next();
//		
//		System.out.println("Enter Salary : ");
//		manager.salary = sc.nextDouble();
//		
		manager.printSalary();
		
	System.out.println("======================================");
	
	Member employee = new Employee();
	employee.name = "Ram Prasad";
	employee.age = 61;
	employee.phone_Number = "92291199";
	employee.address = "kanpur";
	employee.salary = 39999;
	
	employee.printSalary();
	//so here have to downcast the object for getting the members of the child class
	Employee E1 = (Employee)employee;
	System.out.println(E1.Specialisation);
	}
}
