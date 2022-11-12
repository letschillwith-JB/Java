package Day3;

public class Main {

    public static void main(String[] args) {

        ThreadA t1 = new ThreadA();
        t1.setPriority(10);
        t1.run();

        int prod=1;
        for(int i=1; i<=10; i++){
            prod *= i;
        }
        System.out.println("Inside main");
        System.out.println("Product is "+prod);
    }
}
