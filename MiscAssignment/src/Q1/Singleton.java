package Q1;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Singleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already exists. Use getInstance() method.");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}


class MultithreadedTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Singleton instance1 = Singleton.getInstance();
            System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        });

        Thread t2 = new Thread(() -> {
            Singleton instance2 = Singleton.getInstance();
            System.out.println("Instance 2 hashcode: " + instance2.hashCode());
        });

        t1.start();
        t2.start();
    }
}


class ReflectionTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());

        try {
            // Using reflection to create a new instance of Singleton class
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton instance2 = constructor.newInstance();
            System.out.println("Instance 2 hashcode: " + instance2.hashCode());
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }
}



class SerializationTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        // Serialize the Singleton instance to a file
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            oos.writeObject(instance1);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialize the Singleton instance from the file
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
            Singleton instance2 = (Singleton) ois.readObject();
            ois.close();
            System.out.println("Instance 2 hashcode: " + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//Q1/- Create a Singleton Java class without using Enum which will 100% proof
//with Reflection, Multithreading, Deserialization. and write the 3 classes to check
//with :
//Multithreaded approach
//Reflection approach
//Serialization approach
