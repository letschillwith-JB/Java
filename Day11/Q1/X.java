package Day11.Q1;

public interface X {
    public void method1();//abstract method;
    default void method2(){
        System.out.println("Default method of X");
    }
    static void method3(){
        //static method;
        System.out.println("Static method of X");
    }
}
