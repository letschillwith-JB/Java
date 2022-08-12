package YouProblemQ2;

import java.util.Scanner;

public class MultiDimentionalArray {
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Rows");
		int n = sc.nextInt();
		System.out.println("Enter No. of Colms");
		int m = sc.nextInt();
		
		//now create an array by taking value from user
		int[][] arr = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.println("enter value of index :"+i+","+j);
				int val = sc.nextInt();
				arr[i][j] = val;
			}
		}
		//now print an array
		
		//System.out.println("Your Array is");
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
		
		//find sum of even elements colm wise 
		for(int j=0; j<m; j++) {
			int sum = 0;
			for(int i=0; i<n; i++) {
				if(arr[i][j] % 2 == 0) {
					sum += arr[i][j];
				}
			}System.out.println("Sum of colm "+j+" is "+sum);
		}
	}
}