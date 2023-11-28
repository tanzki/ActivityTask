package ProgrammingChallenge;

import java.util.Scanner;

public class NumberToMonth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfDaysInMonth = 0;
		String nameOfMonth = "\n";
		
		System.out.println("Input month here(1-12): ");
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
			nameOfMonth = "January";
			numOfDaysInMonth = 31;
			break;
		case 2:
			nameOfMonth = "Febuary";

			numOfDaysInMonth = 28;
			break;
		case 3:
			nameOfMonth = "March";
			numOfDaysInMonth = 31;
			break;
		case 4:
			nameOfMonth = "April";
			numOfDaysInMonth = 30;
			break;
		case 5:
			nameOfMonth = "May";
			numOfDaysInMonth = 31;
			break;
		case 6:
			nameOfMonth = "June";
			numOfDaysInMonth = 30;
			break;
		case 7:
			nameOfMonth = "July";
			numOfDaysInMonth = 31;
			break;
		case 8:
			nameOfMonth = "August";
			numOfDaysInMonth = 31;
			break;
		case 9:
			nameOfMonth = "September";
			numOfDaysInMonth = 30;
			break;
		case 10:
			nameOfMonth = "October";
			numOfDaysInMonth = 31;
			break;
		case 11:
			nameOfMonth = "November";
			numOfDaysInMonth = 30;
			break;
		case 12:
			nameOfMonth = "December";
			numOfDaysInMonth = 31;
			break;
		}
		
		System.out.print(nameOfMonth + " has " + numOfDaysInMonth + " days\n");
		
	}

}
