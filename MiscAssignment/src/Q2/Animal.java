package Q2;

abstract class Animal {
    private String name;

    // No-args constructor
    public Animal() {
    }

    // Constructor initializing all fields
    public Animal(String name) {
        this.name = name;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract methods
    public abstract void makeNoise();
    public abstract void eat();

    // Behavior method
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    private String breed;

    // No-args constructor
    public Dog() {
    }

    // Constructor initializing all fields of this class
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // Constructor initializing field of this + name of superclass
    public Dog(String name, String breed, String animalName) {
        super(animalName);
        this.breed = breed;
    }

    // Getter and Setter methods
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Overriding abstract methods
    @Override
    public void makeNoise() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    // New method
    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat extends Animal {
    private String nickName;

    // No-args constructor
    public Cat() {
    }

    // Constructor initializing all fields of this class
    public Cat(String name, String nickName) {
        super(name);
        this.nickName = nickName;
    }

    // Constructor initializing field of this + name of superclass
    public Cat(String name, String nickName, String animalName) {
        super(animalName);
        this.nickName = nickName;
    }

    // Getter and Setter methods
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    // Overriding abstract methods
    @Override
    public void makeNoise() {
        System.out.println("Cat is meowing");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    // New method
    public void jump() {
        System.out.println("Cat is jumping");
    }
}

class Demo {
    public void display(Animal animal) {
        //if the supplied object is Dog class object then call its all methods
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("Name: " + dog.getName());
            System.out.println("Breed: " + dog.getBreed());
            dog.makeNoise();
            dog.eat();
            dog.play();
        }
        //if the supplied object is Cat class object then call its all methods
        else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("Name: " + cat.getName());
            System.out.println("Nickname: " + cat.getNickName());
            cat.makeNoise();
            cat.eat();
            cat.jump();
        }
    }

    public static void main(String[] args) {
        // Call the display() method 2

        Demo demo = new Demo();

        // Create Dog object
        Dog dog = new Dog("Buddy", "Labrador");
        // Call display() method with Dog object
        demo.display(dog);

        // Create Cat object
        Cat cat = new Cat("Whiskers", "Fluffy");
        // Call display() method with Cat object
        demo.display(cat);

}
}