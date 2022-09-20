package Day4.Q2;

public class CheckWeather {
    boolean isRaining = true;
    boolean isSnowing = true;
    double temp = 45.00;

    public static void main(String[] args) {
        CheckWeather obj = new CheckWeather();
        if(obj.isRaining && obj.isSnowing && obj.temp<50){
            System.out.println("Lets stay home!");
        }else{
            System.out.println("Let's go outside !");
        }
    }
}
