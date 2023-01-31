package LongestPalindromicSubstring;

public class BruteForce {
    //given a string and you have to find the length of longest palindromic substring
    public static void main(String[] args) {
        String  string = "abcba";
        int n = string.length();

        System.out.println("Max length of Palidromic SubString is: "+(findLongestPalindromicSubString(string,n)));
    }
    public static int findLongestPalindromicSubString(String string, int n){

        int maxLenghtOfSubstring = 0;

        for(int i=0; i<n; i++){
            String subString = "";
            for(int j=i+1; j<=n; j++){
                subString = string.substring(i,j);
                //this give a substring from string[i] - string[j]
                //now have to check whether subString is a palindrome or not
                if (new StringBuffer(subString).reverse().toString().equals(subString)){
                    if(subString.length() > maxLenghtOfSubstring)
                        maxLenghtOfSubstring = subString.length();
                }
            }
        }
        return maxLenghtOfSubstring;
    }
}
