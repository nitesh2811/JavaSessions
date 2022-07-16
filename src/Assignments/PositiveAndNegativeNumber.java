package Assignments;

import java.util.Scanner;

/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class PositiveAndNegativeNumber {

	public static void main(String[] args) {
		int a = 0;
		
		System.out.println("Enter the Input Number"+"\r\n");
		try (Scanner inputValue = new Scanner(System.in)) {
			
			a = inputValue.nextInt();
		}
		if (a > 0) {
			System.out.println("Number is positive");
		} else if (a < 0) {
			System.out.println("Number is negative");
		}

		else {
			System.out.println("Number is neither neagtive nor positive");

		}

	}

}
