package Day4.Q3;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class VowelOrConsonent {
    public static void main(String[] args) {
        checkVowelOrConsonent("x");
        checkVowelOrConsonent("axc");
        checkVowelOrConsonent("a");
    }
    public static void checkVowelOrConsonent(String x){
        if(x == "a" || x=="e" || x=="i" || x=="o" || x=="u" || x == "A" || x=="E" || x=="I" || x=="O" || x=="U")
            System.out.println("Character is Vowel");
        else if(x=="b"||x=="c"||x=="d"||x=="f"||x=="g"||x=="h"||x=="j"||x=="k"||x=="l"||x=="m"||x=="n"||x=="p"||x=="q"||
        x=="r"||x=="s"||x=="t"||x=="v"||x=="x"||x=="y"||x=="z"){
            System.out.println("Character is Consonent");
        }else
            System.out.println("Invalid character");
    }
}
