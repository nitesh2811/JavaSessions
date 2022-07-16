package StringConcepts;

public class StringConstantPoolConcepts {

	public static void main(String[] args) {

		// String literals
		String s1 = "Java";
		String s2 = "Java";

		// String constant pool is part of heap
		// s1 and s2 refers to same in SCP

		System.out.println(s1 == s2);// true
		// both pointing to same objects

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		s1 = "Python";
		System.out.println(s1 == s2);

		String s4 = new String("Hello");
		// Here 2 objects are created
		// On inside Heap memory and one inside String Constant pool
		// In Heap it will be refered by s4 and in String Constant pool - No One

		String s5 = "Hello"; // It will not create a Object
		// It is already present in the SCP.No Object created.

		System.out.println(s4 == s5);
		// s4 is pointing to Object while s5 is pointing to SCP

		String s6 = new String("Hello");
		// Here only one object is created.

		System.out.println("-------------");
		System.out.println(s6.hashCode());
		System.out.println(s5.hashCode());

		// In String Constant pool duplicate objects are not created.
		System.out.println(s4 == s6);

		// == works only with String literals as both points towards same value in SCP

		System.out.println("*************************");
		String str = "Hello World ";
		System.out.println(str.hashCode());
		// Only one object will be created
		str = str + "Java"; // Original Value is not changed
		// A new seperate String is created with Hello World Java.
		System.out.println(str.hashCode());

		// String are immutable Objects
		// Value of Strings cannot be changed

		String str1 = "Hello World ";
		System.out.println(str1.hashCode());
		// No Object is created in this case.
		// String is the most used data types and java will optimize memory management
		// for String data
		// garbage collector is applicable for String constant pool also.
		// String constant pool will never has duplicate vales
		// It will always have unique values and better memory utilisation for the
		// Strings
		// Strings are immutable in Java. The value is not modified once created and
		// removed by garbage collector only

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		String string = new String("Automation");
		System.out.println(string);
		

		string = string + "Selenium";

		System.out.println(string);
		

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");

	}
}
//System.out.println(string.hashCode());
//System.out.println(string.hashCode());
