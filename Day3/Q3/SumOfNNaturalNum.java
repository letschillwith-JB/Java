package Day3.Q3;

public class SumOfNNaturalNum {
    public static void main(String[] args) {
        int x = findSumOfNaturalNum(7);
        System.out.println(x);
    }
    public static int findSumOfNaturalNum(int num){
        if(num == 1)return 1;
        else{
            return (num*(num+1))/2;
        }
    }
}
