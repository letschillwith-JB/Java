package Day9.Q1;

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Parrot();
        b1.fly();
        Parrot b2 = (Parrot)b1;
        b2.sing();
    }
}
