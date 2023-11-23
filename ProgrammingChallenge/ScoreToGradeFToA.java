package ProgrammingChallenge;
import java.util.Scanner;
public class ScoreToGradeFToA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Grade here");
		
		int grade = Integer.valueOf(scanner.nextLine());
		
		if (grade >= 90) {
			System.out.println("You get an A Grade!");
		}else if (grade >= 80) {
			System.out.println("You get an B Grade!");
		}else if (grade >= 70) {
			System.out.println("You get an C Grade!");
		}else if (grade >= 60) {
			System.out.println("You get an D Grade!");
		}else {
			System.out.println("You get an F Grade!");
		}
	}

}
