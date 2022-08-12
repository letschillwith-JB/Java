package YouProblemQ3;

public class FindPrimeNoArray {
	
	public static int[] findAndReturnPrimeNumbers (int[] inputArray) {
		int indexOfArr = 0;
		int[] arr = new int[inputArray.length];
		// write here the logic for primeNumbers
		
		for(int i=0; i<inputArray.length; i++) {
			int prime = 1;
			for(int j=2; j<inputArray[i]; j++) {
				if(inputArray[i] % j == 0 ) {
					prime = 0;
					break;
				}
			}
			if(prime == 1) {
				arr[indexOfArr++] = inputArray[i];
			}
		}
		return arr;
	}
	
	static void printArr(int[] arr) {
		int primeNoFound = 0; 
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				primeNoFound = 1;
				System.out.print(arr[i]+" ");
			}
		}
		if(primeNoFound == 0)
			System.out.println("Prime No. is not Found");
	}
	
	public static void main(String[] args) {
		int[] ar = {10,21,130};
		int[] a = findAndReturnPrimeNumbers(ar);
		printArr(a);
	}
}
