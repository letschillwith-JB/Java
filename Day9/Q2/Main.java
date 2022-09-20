package Day9.Q2;

public class Main {
    public static void main(String[] args) {
        Animal arr[] = new Animal[3];
        arr[0] = new Dog();
        arr[1] = new Cat();
        arr[2] = new Tiger();
        // calling all the methods from all 3 elements object
        arr[0].eat();//dog
        arr[0].walk();
        arr[0].makeNoise();

        arr[1].eat();//cat
        arr[1].walk();
        arr[1].makeNoise();

        arr[2].eat();
        arr[2].walk();
        arr[2].makeNoise();
    }
}
