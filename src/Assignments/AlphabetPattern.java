package Assignments;

public class AlphabetPattern {

	public static void main(String[] args) {

		/**
		 A 
		 A B 
		 A B C 
		 A B C D 
		 A B C D E 
		 A B C D E F
		 */
		char ch;
		for (int i = 1; i <= 6; i++) {
			ch = 65;
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}

			System.out.println();
		}

		System.out.println("------------------------");
		
		/**
		 
		A 
		B B 
		C C C 
		D D D D 
		E E E E E 
		F F F F F F
		 
		 */

		char ch1 = 65;
		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(ch1 + " ");
				;
			}
			ch1++;
			System.out.println();
		}

	}
}
