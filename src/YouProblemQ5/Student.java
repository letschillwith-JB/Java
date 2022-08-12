/*
 Q5) Create a Student Bean class with the following 
fieldsroll: Integer
name: String
address: String
marks: Integer
Create a Demo class and perform the following operation in the main method:
Take the number as input from the user, How many Student objects need to be
created.
Create an array of Students with those numbers.
Initialize all the student objects by taking details from the user.
print all the Student details.
print the average of all the Student marks.
*/
package YouProblemQ5;

public class Student {
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	Student(){
		//zero argument constructor;
	}
	Student(int roll, String name, String address, int marks){
		setRoll(roll);
		setName(name);
		setAddress(address);
		setMarks(marks);
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
