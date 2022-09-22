package Overriding_InstanceOf.Q2;

public class RoadSideHotel implements Hotel {
    @Override
    public void chickenBiryani() {
        System.out.println("This is Chicken Biryani from RoadSide Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("This is Masala Dosa from RoadSide Hotel");
    }
}
