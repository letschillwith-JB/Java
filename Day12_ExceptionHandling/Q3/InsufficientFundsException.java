package Day12_ExceptionHandling.Q3;

import java.io.IOException;

public class InsufficientFundsException extends IOException {
InsufficientFundsException(String message){
    System.out.println(message);
}
}
