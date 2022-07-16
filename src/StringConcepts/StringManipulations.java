package StringConcepts;

/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class StringManipulations {

	public static void main(String[] args) {

		// String is a class in Java
		// String is collection of multiple characters
		// It maintain character array to store the values
		String s = "hello this is my java code and i am happy";

		// length of the String
		System.out.println(s.length());

		System.out.println(s.charAt(0));

		System.out.println(s.charAt(19));

		// System.out.println(s.charAt(-1));
		// String Index out of bound Exception

		// System.out.println(s.charAt(20));
		// String Index out of bound Exception

		System.out.println(s.indexOf("t"));

		System.out.println(s.indexOf("java"));
		// Value of j in given string

		// The first position of i.
		System.out.println(s.indexOf("i"));

		// This is the second occurenece of i.
		System.out.println(s.indexOf("i", s.indexOf("i") + 1));

		// Find third occurenece of i
		System.out
				.println("The third occurenece " + "of i is " + s.indexOf("i", s.indexOf("i", s.indexOf("i") + 1) + 1));

		// this will give -1 not 0 as it is the
		// index of the starting character of any String.
		System.out.println(s.indexOf("python"));

		// if we have to check admin is present in the String or not.
		String mesg = "welcome admin";
		if (mesg.indexOf("admin") > 0) {
			System.out.println("correct mesgg");
		}

		// trim:
		String s1 = "         hello Selenium       ";
		// Will trim spaces from corners and not between
		System.out.println(s1.trim());

		// replace
		String s2 = "hello testing";// hellotesting
		System.out.println(s2.replace(" ", ""));

		String s3 = "           hello selenium     ";
		System.out.println(s3.trim().replace(" ", ""));
		// replace character of String literal

		String str = "this is selenium code";
		System.out.println(str.toUpperCase());

		// Changing the case of the String literal
		System.out.println(str.toLowerCase());

		// equals
		String t1 = "hello google";
		// String t2 = "hello google";
		String t2 = "hello Google";// String are case sensitive.
		String t3 = "hello google";
		// Output will be false.
		System.out.println(t1.equals(t2));

		// If we want to ignore to case
		System.out.println(t1.equalsIgnoreCase(t2));

		// String should be matched exactly ,character by character

		System.out.println(t1 == t3);// It will give true.
		// Concept of Constant pool and not objects
		// For the comparison .equals method to be used
		// For primitive data types == is to be used
		// For object comparison we use .equals method

		// contains():
		String m = "welcome to testing";
		System.out.println(m.contains("welcome"));

		if (m.contains("welcome")) {
			System.out.println("this is correct");
		} else {
			System.out.println("this is incorrect");
		}

		// substring:

		// A part of the string from the main string
		String p = "this is my testing code";

		// want testing code as output
		System.out.println(p.substring(3));
		// Starting index to the last

		System.out.println(p.substring(3, 11));
		// SubString is an overloaded method.
		// It will always give end index-1

		String m1 = "your order id is 12345";

		String orderID = m1.substring(m1.indexOf("12345"));
		System.out.println(orderID);

		// when the value of the orderId is changing
		System.out.println(m1.substring(m1.indexOf("is") + 3, m1.length()));

		String st = new String("hello");//2 objects will be created 
		//one inside Heap. 
		//one inside the String Constant pool.
		String st1 = "hello";

		System.out.println(st == st1);// false
		// st is an object
		// st1 created inside the constant pool.

		System.out.println(st.equals(st1));

	}

}
