package Day3;

public class ThreadA extends Thread{

    @Override
    public void run() {
        int prod=1;
        for(int i=1; i<=10; i++){
            prod *= i;
        }
        System.out.println("Inside thread 1");
        System.out.println("Product is "+prod);
    }
}
