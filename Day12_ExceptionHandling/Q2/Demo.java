package Day12_ExceptionHandling.Q2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        try{
            int q = (int) Math.floor(x/y);
            System.out.println("Quotient of "+x+"/"+y+" is "+q);
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }finally {
            System.out.println("Inside finally block");
        }
    }
}
