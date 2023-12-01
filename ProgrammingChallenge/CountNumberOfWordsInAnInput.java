package ProgrammingChallenge;

import java.util.Scanner;

public class CountNumberOfWordsInAnInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input words here: ");
        String inputWords = scanner.nextLine();

        String[] words = inputWords.split("\\s+");
        
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);

	}
		  
}

