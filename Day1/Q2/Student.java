package Day1.Q2;

import java.util.*;

public class Student {

    private int roll;
    private String name;
    private String address;
    private int marks;

    public Student() {

    }

    public Student(int roll, String name, String address, int marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name=" + name +
                ", address=" + address +
                ", marks=" + marks +
                '}';
    }


    public static void main(String[] args) {
        List<Student> l1 = new ArrayList<>();


        Map<Student ,String> details= new TreeMap<>(new AccToMarks());

        details.put(new Student(1,"raj","bhopal",100));
        details.put(new Student(2,"Rahul","karnataka" , 99));
        details.put(new Student(3,"Gopal","Jharkhand" , 93));
        details.put(new Student(4,"Kullu","Assam" ,91 ));


        Set<Map.Entry<Student,String>> det= details.entrySet();

        for(Map.Entry<Student,String> x:det){
            System.out.println(x.getKey()+" => "+x.getValue());
        }
    }
}


class AccToMarks implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getMarks()< s2.getMarks()){
            return 1;
        }
        else {
            return -1;
        }



    }
}
