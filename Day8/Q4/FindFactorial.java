package Day8.Q4;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        long y=findFactorial(10);
        System.out.println("Factorial is "+y);
    }
    public static long findFactorial(int x){
        if(x==2)return 2;
        else if(x==1)return 1;
        return x*findFactorial(x-1);
    }
}
