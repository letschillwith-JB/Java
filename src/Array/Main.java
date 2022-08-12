package Array;

public class Main{
	//here we creating Array of Student class
	
		
public static void main(String[] args) {
	Student[] student = new Student[2];
	student[0] = new Student("Ram",11);
	student[1] = new Student("Shyam",12);
	
	
	for( Student s:student) {
		s.printDetails();
	}
	
}
}