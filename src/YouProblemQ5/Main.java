package YouProblemQ5;
import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Students");
		int num = sc.nextInt();
		Student[] studentArr = new Student[num]; 
		
		for(int i=0; i<num; i++) {
			System.out.println("Enter roll no of student "+i);
			int rollNum = sc.nextInt();
			
			System.out.println("Enter name of student "+i);
			String name = sc.next();
			
			System.out.println("Enter Address of student "+i);
			String address = sc.next();
			
			System.out.println("Enter Marks of student "+i);
			int marks = sc.nextInt();
			
			//create array 
			studentArr[i] = new Student(rollNum, name, address, marks);
		}
		
		for(Student i : studentArr) {
			System.out.println("RollNo. is: "+i.getRoll()+", Name is: "+i.getName()+", Address is: "+i.getAddress()+", Marks is: "+i.getMarks());
			
		}
	}
}
