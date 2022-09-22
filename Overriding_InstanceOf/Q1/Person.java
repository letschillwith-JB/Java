package Overriding_InstanceOf.Q1;

public class Person {
    String name = "kalu";
    String gender = "M";
    Address address ;



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address={" +
                "city=" + address +
                "state=" + address+
                "Pincode="+address +
                "}"+
                '}';
    }
}
class Address{
    String city = "Kanpur";
    String state = "U.P";
    String pinCode = "432119";

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
class Instructor extends Person{
    int instructorId = 100;
    int salary = 25000;

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorId=" + instructorId +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
    "}"+
                ", address {" +
                "city="+address+
                ", state=" + address+
                ", pinCode= +"+address+
                '}';
    }
}
class Student extends Person{
    int studentId = 786;
    String courseEnrolled = "JA111";
    int courseFee = 300000;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", courseFee=" + courseFee +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }
}

