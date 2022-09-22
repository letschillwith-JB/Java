package Overriding_InstanceOf.Q1;

public class Main {
    public static Person generatePerson(Person person){
        if(person.equals(null)){
            System.out.println("Null cannot resolved");
        }return person;
    }

    public static void main(String[] args) {
        Person person1 = generatePerson(new Student());
        System.out.println(person1);
        Person person2 = generatePerson(new Instructor());
        System.out.println(person2);
    }
}
