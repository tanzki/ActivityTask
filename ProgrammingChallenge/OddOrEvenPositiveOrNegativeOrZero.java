package ProgrammingChallenge;

import java.util.Scanner;

public class OddOrEvenPositiveOrNegativeOrZero {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	            System.out.print("Enter a number: ");
	            int num = scanner.nextInt();

	            // Checking if the number is zero, positive, or negative
	            if (num == 0) {
	                System.out.println("The number is 0.");
	            } else if (num > 0) {
	                System.out.println("The number is positive.");
	            } else {
	                System.out.println("The number is negative.");
	            }

	            // Checking if the number is odd or even
	            if (num%2 == 0) {
	                System.out.println("The number is even.");
	            } else {
	                System.out.println("The number is odd.");
	            }

	            System.out.println("Please enter a valid number.");
	    }
	}