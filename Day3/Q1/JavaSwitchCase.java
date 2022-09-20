package Day3.Q1;

public class JavaSwitchCase {
    public static void switchCase(String city){
        switch (city){
            case "Mumbai":
                System.out.println("Financial City");break;
            case "Kolkata":
                System.out.println("City of Joy");break;
            case "Delhi":
                System.out.println("Capital of the country");break;
            case "Bangalore":
                System.out.println("Cyber City");break;
            default:
                System.out.println("May be Other Indian City");
        }
    }

    public static void main(String[] args) {
        switchCase("Delhi");
        switchCase("Mumbai");
        switchCase("Bhopal");
    }
}
