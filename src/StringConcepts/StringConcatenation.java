package StringConcepts;

/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class StringConcatenation {

	// String is a class in Java.
	// It should be written in double quotes.
	// Java behaves differently for the String.
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String s = "Hello World";
		String s1 = "Nitesh";
		String s2 = "100";

		String x = "Hello";
		String y = "Testing";

		int a = 100;
		int b = 200;

		System.out.println(x + y); // HelloTesting
		System.out.println(a + b);// 300

		System.out.println(a + b + x + y);// 300HelloTesting//It excutes from left to right.
		System.out.println(x + y + a + b);// HelloTesting100200
		System.out.println(x + y + (a + b));// HelloTesting300

		System.out.println("the value of a is " + a);
		System.out.println("the value of b is " + b);
		System.out.println("sum is: " + (a + b));

		double c = 12.33;
		double d = 23.33;
		System.out.println(c + d);

		System.out.println(x + y + c + d + a + b);
		System.out.println(a + b + x + y + c + d);// 300HelloTesting12.3323.33

		char t1 = 'a';// 97 char is the part of the integer family only.
		char t2 = 'b';// 98
		char t3 = 'r';
		char t4 = '1';
		// We are adding the two character types. Hence the intergeral operation if
		// performed.
		System.out.println(t1 + t2);// 195 //No Concat operation.
		System.out.println(t1);
		System.out.println((int) t3); // ASCII value of the character will be displayed
		System.out.println((int) t4);// 49

		// The ASCII values of the characters in Java.
		// a-z: 97 to 122
		// A-Z: 65 to 90
		// 0-9: 48 to 57

		System.out.println(x + t1);
		System.out.println(t1 + t2 + t4 + x + y);

		System.out.println(10 + 20);
		System.out.println(20 / 10);

		// System.out.println(9/0);// ArithmeticException
		System.out.println(0 / 9); // 0

		System.out.println(5 / 2);// 2 //Both number are int
		System.out.println(5.0 / 2);// 2.5 //One number in double format.
		System.out.println(5 / 2.0);// 2.5
		System.out.println(5.0 / 2.0);// 2.5

		System.out.println(2.5 / 0); // Infinity
		System.out.println(2 / 0.0); // Infinity
		System.out.println(2.5 / 0.0);// Infinity
		// System.out.println(0/0); // ArithmeticException
		System.out.println(0 / 0.0); // NaN-Not a Number
		System.out.println(0.0 / 0.0);// NaN
		System.out.println(0.0 / 0); // NaN

	}
}

// Dead code - if the else part is never executed of the if else block then else part is called as dead code 
// &&-short circut operator 
// never compare string with == operator beacuse == is used for comparison of primitive data types 
// non primitive .equals method is used 
// break is only applicable for loop and switch cases and not applicable for if else block
// Drawback of if condition - all the ifs are executed one by one and to solve this problem we use switch case statement 
// Swtich cannot be used for boolean values.
// Case is just a value in switch case. 
// If break is not used with each case then all the case statment will be excuted.
// ASCII value will be considered only when performing the mathematical operator and other times it will behave normally.
