package Day10.Q2;

public final class Child extends Parent{
    public Child(int number) {
        super(number);
    }

    @Override
    void method1() {
        System.out.println("Inside overriden method1 of child class");
        if(number<10)
        System.out.println(number);
        else System.out.println("Invalid number");
    }
    void method4(){
        System.out.println("Inside seperate method4 of child class");
    }
}
