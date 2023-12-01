package ProgrammingChallenge;

import java.util.Scanner;

public class CheckVowelsAndConsonants {
	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	       System.out.println("Enter a String: ");
	       String stringInput = scanner.nextLine().toLowerCase();
	       
	       int v = 0;
	       int c = 0;
	       
	       for (int i = 0; i < stringInput.length(); i++) {   
			char ch = stringInput.charAt(i);
				
				if (Character.isLetter(ch)) {
					
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
						v++;
					}else {
						c++;
					}
				}
				
			}
		       
	       	System.out.println("Number of vowels: "+v);
			System.out.println("Number of consonants: "+c);
			
	}

}
