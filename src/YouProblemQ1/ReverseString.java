package YouProblemQ1;
import java.util.*;
public class ReverseString {
	static String reverseString(String s) {
		int length = s.length();
		String str = "";
		//String[] str = new String[length];
		for(int i=length-1; i>=0; i--) {
			str += s.charAt(i);
		}
		System.out.println("Original String is :"+s);
		return str;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String input = sc.next();
		String x = reverseString(input);
		System.out.println("Reversed string is :"+x);
	}
}
