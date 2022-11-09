package Day6_MiltithreadingPart2.Q3;

public class Thread1 implements Runnable{
    @Override
    public void run(){
//        try {
//            Thread.sleep(5000);
//        }catch (Exception e){
//
//        }
        System.out.println("Inside run of Thread1 class ");
        for(int i=1; i<=20; i++){
            if(i%2==1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("End of run method of Thread1 ");
    }
}
