package YouProblem;

public class ArrayBasics {
	static int Print(int[] arr) {
		int pad = 0;
		for(int i:arr) {
			if(i>pad) {
				pad=i;
			}
		}return pad;
	}

	public static void main(String[] args) {
		int[] ar = {200,5,100,108,122};
		int ans = Print(ar);
		System.out.println(ans);
	}
}
