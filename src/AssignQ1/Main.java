package AssignQ1;

public class Main {

	public static void main(String[] args) {
	Bird b1 =  new Parrot();
	b1.fly();
	
	//Since it is a OverRidden method So method inside the child class will be called 
	
	//In order to call the method in the parent class we have to downcast it
	
	Parrot b2 = (Parrot)b1; //---> it is an example of Object Downcasting 
	b2.singing();
	}
}
