package Day8.Q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
    FindPrimeNumber obj = new FindPrimeNumber();
        System.out.println("How many Numbers you want to test ?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            int q = i+1;
            System.out.println("Enter Number "+q);
            arr[i] = sc.nextInt();
        }
    java.util.List l = obj.findAndReturnPrimeNumbers(arr);
    if(l.size()>0){
        System.out.println("Prime Numbers are "+l);
    }
    else
        System.out.println("No Prime Number Found");
    }
    public List<Integer> findAndReturnPrimeNumbers(int[] inputArray){
//write the logic to iterate through the supplied inputArray and return array of prime numbers
//if no prime number is found then return the empty array.
     ArrayList<Integer> al = new ArrayList<>();
    for(int i=0; i<inputArray.length; i++){
    int num=2;
    Boolean pres = true;
    while(num<inputArray[i]) {
        if (inputArray[i] % num++ != 0) {
            continue;
        } else {
            pres = false;
            break;
        }
    }
        if(pres == true) {
            al.add(inputArray[i]);
        }
        }
    return al;
    }
    }

