package Q2;

public class Demo {
	
	
	Demo(){
		this(10);
		System.out.println("Zero arg cons");
	}
	
	Demo(int i){
		this(10f);
		System.out.println("int type cons");
	}
	
	Demo(float f){
		this(10.0);
		System.out.println("float type cons");
	}
	
	Demo(double d){
		System.out.println("double type cons");
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
	}

}
