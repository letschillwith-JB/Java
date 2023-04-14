public class Student {

	private int roll;
	private String name;
	private String address;
	private String collageName;
	
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
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", collageName=" + collageName
				+ "]";
	}
	public Student(int roll, String name, String address, String collageName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}
	Student(){
		
	}
	
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT) {
		Student s = new Student();
		s.setAddress("Nainital");
		s.setCollageName("NIT");
		s.setName("Rahul");
		s.setRoll(1);
		return s;
		}
		else {
			return new Student(2,"Ram","Bhopal","ABC");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(getStudent(false));
		System.out.println(getStudent(true));
	}
	
	
}
