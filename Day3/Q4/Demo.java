package Day3.Q4;

public class Demo {
    public static void main(String[] args) {
       int totalScore = calculateScore(10,5,2,5,2);
        System.out.println(totalScore);
    }
    public static int calculateScore(int one,int two,int three, int four, int six){
        return 1*one+2*two+3*three+4*four+6*six;
    }
}
