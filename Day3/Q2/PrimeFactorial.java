package Day3.Q2;

public class PrimeFactorial {
    public static void main(String[] args) {
        findPrimeFactorial(13);
    }
    public static void findPrimeFactorial(int n){
        if(n>100 || n<2)
            System.out.println("Invalid Number");
        else{
            String bag = "";
            for(int i=1; i<=n; i++){
                if(n%i==0)bag+=i+" ";
            }
            System.out.println(bag);
        }
    }
}
