import java.util.Scanner;

public class TaskSheet113 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number here");		
		int name = Integer.valueOf(scanner.nextLine());
		int remainder = name%2;
		
		
		if (name == 00) {
			System.out.println("The number is 0. it is neither positive or negative.");
		}else {

			if (remainder == 0) {
				System.out.println("The number is even number.");
			}
			else {
				System.out.println("The number is odd number.");
			}
			
			if(name < 0) {
				System.out.println("The number is negative number.");
			}else {
				System.out.println("The number is positive number.");
			}
		
		}
		
	}

}
