package Q3;

public class CheckVowel {
	
	public void checkCharacter(Character c) throws InvalidCharacterException{
		Character C = c.toUpperCase(c);
if(C == 'A' || C == 'E' || C == 'I' || C == 'O' || C == 'U') {
		System.out.println("Character is Vowel");
}
else System.out.println("Character is Consonent");
	}

	
	public static void main(String[] args) throws InvalidCharacterException {
		CheckVowel o1 = new CheckVowel();
		o1.checkCharacter('A');
		
		CheckVowel o2 = new CheckVowel();
		o2.checkCharacter('s');
		
		CheckVowel o3 = new CheckVowel();
		o3.checkCharacter('d');
	}
}
