package Day4_MulthreadingPart1.Q7;

public class Main {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        t1.setName("Dhoni");
        t1.setPriority(8);

        t2.setName("Kohli");
        t2.setPriority(10);

        t1.start();
        t2.start();
    }

}
