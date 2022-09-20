package Day10.Q2;

public class Parent {

    public Parent(int number) {
        this.number = number;
    }

    void method1(){
        System.out.println("Inside method1 of parent class");
        System.out.println(number);
    }
    void method2(){
        System.out.println("Inside method2 of parent class");
    }
    void method3(){
        System.out.println("Inside method3 of parent class");
    }
    final int number ;

}
