package Day10.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 10");
        Parent obj1 = new Child(sc.nextInt());
        obj1.method1();
        obj1.method2();
        obj1.method3();
        Child c = (Child)obj1;
        c.method4();
    }
}
