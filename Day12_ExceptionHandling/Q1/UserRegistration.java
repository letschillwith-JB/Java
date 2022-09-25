package Day12_ExceptionHandling.Q1;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) throws InvalidCountryException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = sc.nextLine();
        System.out.println("Enter userCountry");
        String userCountry = sc.nextLine();
        registerUser(userName,userCountry);
    }

    static void registerUser(String userName, String userCountry) throws InvalidCountryException{
        if(userCountry.equals("India")){
            System.out.println("User registration done successfully");
        }
        else {
                throw new InvalidCountryException("User Outside India cannot be Registered");
        }
    }
}
