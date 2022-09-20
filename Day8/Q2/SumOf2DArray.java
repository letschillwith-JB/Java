package Day8.Q2;
import java.util.Scanner;
public class SumOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Rows");
        int n = sc.nextInt();
        System.out.println("Enter No. of Colms");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("Enter index "+i+" "+j);
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j=0; j<m; j++){
            int sum=0;
            int sum1 = 0;
            for(int i=0; i<n; i++){
                if(arr[i][j]%2==0)
                sum += arr[i][j];
                else
                    System.out.println("SOP in the main different in the main reason ");
                    sum1 += arr[i][j];
            }
            System.out.println("Sum of even numbers in "+j+" colm is "+sum);
            System.out.println("Sum of odd numbers in "+j+" colm is "+sum1);
        }
    }
}
