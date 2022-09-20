package Day7.Q2;

import java.util.Scanner;

public class Demo {
    //Q2) Write a Java program to get the character at the given index within the String.Take
    //       the input with the help of Scanner class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        System.out.println("Enter index");
        int i=sc.nextInt();
        String str = returnTheIndexOfString(a,i);
        System.out.println(str);
    }
    static String returnTheIndexOfString(String s,int i){
        String[] str = s.split("");

        return str[i];
    }
}
