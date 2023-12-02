package ProgrammingChallenge;
import java.util.Scanner;

public class StringBuilder10Characters {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string of at least 10 characters
        System.out.print("Enter a string of at least 10 characters: ");
        String input = scanner.nextLine();

        // Check if the entered string has at least 10 characters
        if (input.length() <= 10) {
            System.out.println("Please enter a string with at least 10 characters.");
        } else {
            // Create a StringBuilder object and append the user input
            StringBuilder stringBuilder = new StringBuilder(input);

            // 1. Print the length of the string.
            System.out.println("Length of the string: " + stringBuilder.length());

            // 2. Print the first character of the string
            System.out.println("First character of the string: " + stringBuilder.charAt(0));

            // 3. Print the last character of the string
            System.out.println("Last character of the string: " + stringBuilder.charAt(stringBuilder.length() - 1));

            // 4. Print the index of the first occurrence of the letter 'a' in the string
            int indexOfA = stringBuilder.indexOf("a");
            System.out.println("Index of first 'a' occurrence: " + indexOfA);

            // 5. Print the substring from index 3 to index 6
            String substringIndex3to6 = stringBuilder.substring(3, 7);
            System.out.println("Substring from index 3 to 6: " + substringIndex3to6);

            // 6. Append the string "123" to the end of the string
            stringBuilder.append("123");
            System.out.println("String after appending '123': " + stringBuilder);

            // 7. Insert the string "xyz" at index 4
            stringBuilder.insert(4, "xyz");
            System.out.println("String after inserting 'xyz' at index 4: " + stringBuilder);

            // 8. Delete the substring from index 2 to index 4
            stringBuilder.delete(2, 5);
            System.out.println("String after deleting substring from index 2 to 4: " + stringBuilder);

            // 9. Delete the character at index 8
            stringBuilder.deleteCharAt(8);
            System.out.println("String after deleting character at index 8: " + stringBuilder);

            // 10. Reverse the string and print it
            stringBuilder.reverse();
            System.out.println("Reversed string: " + stringBuilder);
        }
    }
}