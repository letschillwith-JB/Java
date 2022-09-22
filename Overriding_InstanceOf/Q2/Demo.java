package Overriding_InstanceOf.Q2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        int amt = sc.nextInt();
        Hotel h = d1.provideFood(amt);
        if(h == null) System.out.println("Please Enter a valid amount");
        else if(h instanceof TajHotel){
            h.chickenBiryani();
            h.masalaDosa();
            ((TajHotel) h).welcomeDrink();
        }
        else if(h instanceof RoadSideHotel){
            h.masalaDosa();
            h.chickenBiryani();
        }
    }
    public Hotel provideFood(int amount){
        if(amount>1000){
            return new TajHotel();
        }
        else if(amount>200 && amount<1000){
            return new RoadSideHotel();
        }
        return null;
    }
}
