package tasksheet113;

import java.util.Scanner;

public class TaskSheet113 {

	public static void main(String[] args) {
        int startRange = 1;
        int endRange = 10; // Change this value to define the end of the range

        for (int i = startRange; i <= endRange; i++) {
            String status = (i % 2 == 0) ? "even number" : "odd number";
            System.out.println(i + " is " + status);
        }
		
	}

}
