package Day4.Q4;

import com.sun.security.jgss.GSSUtil;

public class Student {
    int roll;
    String name;
    int marks;
    public void displayStudentDetails(){
        System.out.println("Roll is :"+roll);
        System.out.println("Name is :"+name);
        System.out.println("Marks is :"+marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.roll = 1; s1.name = "Jb"; s1.marks = 500;
        s2.roll = 2; s2.name = "Bj"; s2.marks = 400;
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s1 = null;
        s2 = null;
    }
}
