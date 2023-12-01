package ProgrammingChallenge;

import java.util.Scanner;

public class AreYouAPalindrome {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String palindromeInput = scanner.nextLine().toLowerCase();

        palindromeInput = palindromeInput.replaceAll("[^a-zA-Z]", "");

        boolean isPalindrome = true;
        for (int i = 0; i < palindromeInput.length() / 2; i++) {
            if (palindromeInput.charAt(i) != palindromeInput.charAt(palindromeInput.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

	}

}
