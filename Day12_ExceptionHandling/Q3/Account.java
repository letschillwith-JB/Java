package Day12_ExceptionHandling.Q3;

public class Account {
    String accountNumber;
    double balance;
    Account(String accountNumber){
        this.accountNumber = accountNumber;
    }
    void deposit(int amount){
    balance += amount;
        System.out.println("You deposited "+amount+" succesfully, "+"Your balance is " + balance);
    }
    double withdraw(int amount)throws InsufficientFundsException{
        if(balance>=amount){
            balance -= amount;
            System.out.println("You withdraw "+ amount + " succesfully, your balance is "+balance);
        }
        else if(balance<amount){
            throw new InsufficientFundsException("Cannot complete transaction due to Insufficient fund available");
        }
        return balance;
    }
}
