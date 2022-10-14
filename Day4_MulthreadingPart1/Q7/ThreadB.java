package Day4_MulthreadingPart1.Q7;

public class ThreadB extends Thread{
    public void run(){
        for(int i=0; i<1; i++){
            System.out.println(getName());
            System.out.println(getPriority());
        }
    }
}
