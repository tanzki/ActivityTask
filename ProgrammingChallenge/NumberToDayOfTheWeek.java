package ProgrammingChallenge;

import java.util.Scanner;

public class NumberToDayOfTheWeek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1-7: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            String day = getDayOfWeek(number);
            System.out.println(day);
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        scanner.close();
    }

    public static String getDayOfWeek(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid input";
        }
		 
    }
}



