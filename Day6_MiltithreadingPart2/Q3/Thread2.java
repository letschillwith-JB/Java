package Day6_MiltithreadingPart2.Q3;

public class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside run method of Thread2 ");
        for(int i=1; i<=20; i++){
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("End of run Method of Thread2 class");

    }
}
