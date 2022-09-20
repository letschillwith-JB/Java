package Day8.Q5;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Student you want to create");
        Student[] arr = new Student[sc.nextInt()];
        for(int i=0; i< arr.length; i++){
            int ii=i+1;
            System.out.println("Enter roll of student "+ii);
            int roll = sc.nextInt();sc.nextLine();
            System.out.println("Enter name of student "+ii);
            String name = sc.nextLine();
            System.out.println("Enter address of student "+ii);
            String address = sc.nextLine();
            System.out.println("Enter marks of student "+ii);
            int marks = sc.nextInt();sc.nextLine();
            arr[i] = new Student(roll,name,address,marks);
        }
        for(Student i:arr){
            System.out.println(i);
        }
        //average of marks
        int total_marks=0;
        int n=0;
        for(Student i:arr){
            total_marks+=i.getMarks();
            n++;
        }
        System.out.println("Aveerage of marks is :"+total_marks/n);
    }
}
