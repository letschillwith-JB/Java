package Array;
//here we are just seeing very basics about arrays in java 

public class Student {
	String name;
	int rollNo;
	
	Student(String name, int rollNo)//one constructor
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	
	void printDetails() 
	{
		System.out.println("Name is : "+name+", Roll no is : "+rollNo);
	}
}

