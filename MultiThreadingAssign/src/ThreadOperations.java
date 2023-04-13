import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface RunThread {
    void startThread(Thread t);
}

public class ThreadOperations {

    static void reverseArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Swapping...");
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println("Swapping " + arr[i] + ", " + arr[arr.length - 1 - i]);
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    void findNearestToAverage() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 15, 6, 7, 10, 12, 20);
        System.out.println("List: " + list);
        double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        int nearest = list.get(0);
        int minDifference = Math.abs(list.get(0) - (int) average);
        for (int num : list) {
            int difference = Math.abs(num - (int) average);
            if (difference < minDifference) {
                minDifference = difference;
                nearest = num;
            }
        }
        System.out.println("Average is " + average + " Element nearest to average is " + nearest);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadOperations threadOperations = new ThreadOperations();

        // Method reference for implementation of Runnable interface using reverseArray() method
        Runnable r1 = ThreadOperations::reverseArray;

        // Method reference for implementation of Runnable interface using findNearestToAverage() method
        Runnable r2 = threadOperations::findNearestToAverage;

        // Method reference for implementation of RunThread interface using start method of Thread class
        RunThread rt = Thread::start;

        // Create list of threads containing two threads with r1 and r2 as Runnable implementations
        List<Thread> threadList = new ArrayList<>();
        threadList.add(new Thread(r1));
        threadList.add(new Thread(r2));

        // Execute both threads
        for (Thread t : threadList) {
            rt.startThread(t);
        }

        // Sleep for 500ms to ensure main thread finishes at last
        Thread.sleep(500);
    }
}
