package Day9.Q3;

public class Main {
    public static void main(String[] args) {
        Member employee = new Employee();
        Member manager = new Manager();
        employee.name = "E1";
        employee.age = 22;
        employee.phoneNumber = "9192939495";
        employee.address = "Chind";
        employee.salary = 20000;
        //printing ee details
        Employee ee = (Employee)employee;
        ee.printDetils();

        manager.name = "M1";
        manager.age = 33;
        manager.phoneNumber = "123456679";
        manager.address = "Delhi";
        manager.salary = 50000;
        //printing details
        Manager man = (Manager)manager;
        man.printDetils();

    }
}
