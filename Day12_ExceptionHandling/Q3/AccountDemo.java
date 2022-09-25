package Day12_ExceptionHandling.Q3;

public class AccountDemo {
    public static void main(String[] args) throws InsufficientFundsException {
        Account obj1 = new Account("12345");
        obj1.deposit(5000);
        obj1.withdraw(1000);
        obj1.deposit(2200);
        obj1.withdraw(7000);
    }
}
