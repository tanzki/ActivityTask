package ProgrammingChallenge;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String Here: ");
		String stringInput = scanner.nextLine();
		
		//1. Find and print the length of the string.
		int length = stringInput.length();
		System.out.println("String Length is: " + length);
		
		//2. Convert the string to uppercase and print it.
		String upperStr = stringInput.toUpperCase();
		System.out.println("String UpperCase Chracter is: " + upperStr);
		
		//3. Convert the string to lowercase and print it.
		String lowerStr = stringInput.toLowerCase();
		System.out.println("String LowerCase Chracter  is: " + lowerStr);
		
		//4. Print the first character of the string.
		char firstCharacter = stringInput.charAt(0);
		System.out.println("String Chracter UpperCase is: " + firstCharacter);
		
		//5. Print the last character of the string.
		char lastCharacter = stringInput.charAt(stringInput.length() - 1);
		System.out.println("String Chracter UpperCase is: " + lastCharacter);
		
		//6. Print the substring starting from the second character to the fifth character of the string
		String substring = "";
		if (stringInput.length() >= 5) {
			substring = stringInput.substring(1, 5);
		}
		System.out.println("Substring from the second to the fifth character: " + substring);
	}

}
