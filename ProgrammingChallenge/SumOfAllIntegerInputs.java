package ProgrammingChallenge;

import java.util.Scanner;

public class SumOfAllIntegerInputs {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	int sum = 0;

    System.out.println("Enter integers (enter a non-integer value to stop):");

    while (scanner.hasNextInt()) {
        int num = scanner.nextInt();
        sum += num;
    }

    System.out.println("The sum of all the integers entered is: " + sum);

    scanner.close();
    }

}
