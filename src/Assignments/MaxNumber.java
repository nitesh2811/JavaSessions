package Assignments;

/**
 * 
 * @author Nitesh Agrawal
 *
 */
public class MaxNumber {
	public static void main(String[] args) {
		
		//Taking Input from Command line arguments
		//Input comes in form of Strings which is 
		//then converted to Integer type using the 
		//wrapper class
		
		int a, b, c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);

		if ((a > b) && (a > c)) {
			System.out.println("The max number is " + a);
		} else if (b > c) {
			System.out.println("The max number is " + b);
		} else {
			System.out.println("The max number is " + c);
		}
	}
}
