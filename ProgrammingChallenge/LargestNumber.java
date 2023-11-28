package ProgrammingChallenge;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input 1st number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Input 2nd number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Input 3rd number: ");
        double num3 = scanner.nextDouble();
        
        double largestNumber = largestNumber(num1, num2, num3);
        
        if (Double.isNaN(largestNumber)) {
			System.out.println("All numbers are equal");
		}else {
			System.out.println("The largest number is:" + largestNumber);
		}        
    }


	public static double largestNumber(double num1, double num2, double num3) {
		if (num1 == num2 && num2 == num3) {
    		return Double.NaN;
			
		}else {
			return Math.max(num1,  Math.max(num2, num3));
		}
	}
}