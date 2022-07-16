package Assignments;

/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class PrintOutput1 {

	public static void main(String[] args) {
	
		/**
		 * Write a Java program to compute the specified expressions and print the output. Go to the editor
			Test Data:
			((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
		 */
	
		double a=25.5;
		double b=3.5;
		double c=40.5;
		double d=4.5;
		
		double e=((a*b-b*b)/(c-d));
		System.out.println(e);
		
		
		/**
		 * 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		Expected Output :
		Hello
		Nitesh
		 */
		System.out.println("hello"+"\r\n"+"Nitesh");
		
		/**
		 * Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
			"Your Total amount is. 3700".
		 */
		//Need to ask from Naveen if this is good approach
		int sum=100+200+3400;
		System.out.println("\"Your Total amount is." +sum+"\"");


	}

}
