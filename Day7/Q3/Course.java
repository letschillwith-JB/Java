package Day7.Q3;

import java.util.Scanner;

public class Course {
    int courseId;
    String courseName;
    int courseFee;

    public void displayCourseDetails(){
        System.out.println("COurse Id :"+courseId+" Course Name :"+courseName+" Course Fee: "+courseFee);
    }
    public static void authenticate(String username, String password){
        if(username.equals("Admin") && password.equals("1234")){
            Course obj = new Course();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter course Id");
            obj.courseId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter course name");
            obj.courseName = sc.nextLine();
            System.out.println("Enter course fee");
            obj.courseFee = sc.nextInt();
            sc.nextLine();
            obj.displayCourseDetails();
        }
        else{
            System.out.println("Invalid username or password");
        }
    }

    public static void main(String[] args) {
        authenticate("Admin","1234");
        authenticate("qqqq","1234");
    }
}
