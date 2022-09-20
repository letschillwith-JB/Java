package Day8.Q1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        String str = reverseTheString(s);
        System.out.println("Reverse String is: "+str);
    }
    static String reverseTheString(String s){
        String[] aa = s.split("");
        String ans[] = new String[aa.length];
        for(int i=aa.length-1; i>=0; i--){
            ans[i] = aa[i];
        }
        return ans.toString();
    }
}
