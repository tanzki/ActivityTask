package ProgrammingChallenge;

import java.util.Scanner;

public class IntegerInputFromTheUserAndUses {



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number");
		int num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}

}
