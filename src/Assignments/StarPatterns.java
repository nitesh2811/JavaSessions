package Assignments;

public class StarPatterns {

	public static int i = 0;
	public static int j = 0;
	public static int k = 0;

	public static void main(String[] args) {
		/**
		 
		 *
		 **
		 ***
		 ****
		 *****
		
		 */
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// This will give new line.
			System.out.println();
		}

		System.out.println("----------------");

		/**
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */

		for (i = 5; i >= 1; i--) {
			for (j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("----------------");
		/**
		 
		     *
		    **
		   ***
		  ****
		 *****
		 
		 */

		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------");
		/**
		 
		 *****
		  ****
		   ***
		    **
		     *
		 
		 */

		for (i = 1; i <= 5; i++) {
			for (k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
