
//Question-01
//Create a class Country that contains a public map (It's a class member) such that country name is key and
//
//its capital as value. Initialize the map using static block with following values-
//Afghanistan: kabul, Belgium: Brussels, LinkedHashMap, Canada: Ottawa, Egypt:
//
//Cairo, Finland: Helsinki, Greece: Athens, Hungary: Budapest, Iraq: Baghdad,
//Norway: Oslo, South Korea: Seoul
//Create a method synchronized void askCapitalName() in which name of all countries are stored in the
//arraylist. This method should be executed by a Thread named "Master". Any country name should be picked
//randomly (Using Math.random() method) and displayed to the user. Once a country is picked it must not be
//picked again (To ensure that you can remove picked contry name from arraylist as well as from Map)
//Create another method synchronized void printCapitalName(). This method should be executed another
//Thread named "Student". Whatever the country name is picked by "Master" thread its corresponding capital
//name should be printed.
//Both threads should executed until all country names are picked and capital name is printed.


import java.util.*;

public class Country {
    public static Map<String, String> capitals = new LinkedHashMap<>();
    private static ArrayList<String> countryNames = new ArrayList<>();
    
    static {
        capitals.put("Afghanistan", "Kabul");
        capitals.put("Belgium", "Brussels");
        capitals.put("Canada", "Ottawa");
        capitals.put("Egypt", "Cairo");
        capitals.put("Finland", "Helsinki");
        capitals.put("Greece", "Athens");
        capitals.put("Hungary", "Budapest");
        capitals.put("Iraq", "Baghdad");
        capitals.put("Norway", "Oslo");
        capitals.put("South Korea", "Seoul");
        
        countryNames.addAll(capitals.keySet());
    }

    public synchronized void askCapitalName() {
        Thread.currentThread().setName("Master");
        while (!countryNames.isEmpty()) {
            int index = (int) (Math.random() * countryNames.size());
            String countryName = countryNames.remove(index);
            System.out.println(Thread.currentThread().getName() + " picked " + countryName);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printCapitalName() {
        Thread.currentThread().setName("Student");
        while (!capitals.isEmpty()) {
            Iterator<String> iterator = capitals.keySet().iterator();
            while (iterator.hasNext()) {
                String countryName = iterator.next();
                if (!countryNames.contains(countryName)) {
                    String capitalName = capitals.get(countryName);
                    System.out.println(Thread.currentThread().getName() + " picked " + capitalName);
                    iterator.remove();
                    break;
                }
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Country country = new Country();

        Thread masterThread = new Thread(() -> country.askCapitalName());
        Thread studentThread = new Thread(() -> country.printCapitalName());

        masterThread.start();
        studentThread.start();
    }
}

