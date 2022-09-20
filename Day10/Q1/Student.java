package Day10.Q1;

import java.util.Scanner;

public class Student {
    Student(){}
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void displayDetail(){
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        s1.setName(sc.nextLine());
        System.out.println("Enter roll");
        s1.setRoll(sc.nextInt());sc.nextLine();
        System.out.println("Enter marks");
        s1.setMarks(sc.nextInt());sc.nextLine();
        System.out.println(s1);
    }
    private char calculateGrade(){
        if(getMarks()>=500)
        return 'A';
        else if(getMarks()>=400 && getMarks()<500)
            return 'B';
        else return 'C';
    }
    @Override
    public String toString(){
        return "Name: "+getName()+" Roll: "+getRoll()+" Marks: "+getMarks()+" Grade: "+calculateGrade();
    }
}
