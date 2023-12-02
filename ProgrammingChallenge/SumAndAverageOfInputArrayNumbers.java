package ProgrammingChallenge;
import java.util.Scanner;

public class SumAndAverageOfInputArrayNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Input the element of the array number: ");
		int n = scanner.nextInt();
		
		double[] numbers = new double[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextDouble();
		}
		
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		
		double average = sum / n;
		
		System.out.println("Sum the numbers " + sum);
		System.out.println("Average of numbers: " + average);
	}

}
