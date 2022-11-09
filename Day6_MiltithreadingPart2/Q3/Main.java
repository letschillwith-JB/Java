package Day6_MiltithreadingPart2.Q3;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread1 ta = new Thread1();
        Thread t1 = new Thread(ta);

        Thread2 tb = new Thread2();
        Thread t2 = new Thread(tb);

        t1.start(); // here thread1 start
        t2.start(); // here thread2 start
        //t1.join();

    }
}
