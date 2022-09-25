package Day12_ExceptionHandling.Q1;

public class InvalidCountryException extends Exception{
    InvalidCountryException(String e){
        System.out.println(e);
    }
}
