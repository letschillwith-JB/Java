package Day11.Q1;

public interface Y {
    void m1();
    default void m2(){
        System.out.println("Default method of Y");
    }
    static void m3(){
        System.out.println("Static method of Y");
    }
}
