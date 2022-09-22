package Overriding_InstanceOf.Q2;

public class TajHotel implements Hotel {

    @Override
    public void chickenBiryani() {
        System.out.println("This is Chicken Biryani from The Taj Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("This is masala dosa from The Taj Hotel");
    }
    public void welcomeDrink(){
        System.out.println("Welcome drink from Taj Hotel");
    }
}
