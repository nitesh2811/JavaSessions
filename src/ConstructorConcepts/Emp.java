package ConstructorConcepts;
/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class Emp {

	String name;
	int age;
	String city;
	double sal;
	boolean isPem;

	// Constructor will help us design the Object

	public Emp(String name, int age) { 
		// here name is local variable of the constructor
		System.out.println("emp Const...");
		// name=name; Warning Tom to Tom only
		this.name = name;
		this.age = age;
		// this is a keyword in Java.
		// It means pointing to a current class Object.

	}

	public Emp(String name, int age, String city) 
	{ // here name is local variable
		System.out.println("emp Const...");
		// name=name; Warning Tom to Tom only
		this.name = name;
		this.age = age;
		this.city = city;
		// this is a keyword in Java.
		// It means pointing to a current class Object.

	}

	public Emp(String name, int age, String city, double sal, boolean isPem) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.sal = sal;
		this.isPem = isPem;
	}

	public static void main(String[] args) {

		Emp obj = new Emp("Nitesh", 30);
		
		//Emp obj1=new Emp();
		/**
		 * Restricts the Object Creation.
		 * Default constructor not present 
		 * So advantage of this feature it will avoid un-necessary object in the Heap Memory
		 * We are restricting to creating of unnecessary objects Object creation policy with
		 * help of Constructor
		 */

		System.out.println(obj.name);
		System.out.println(obj.age);
		// Output will be default values if the values are not assigned to instance variables 
		//in Constructor.

		Emp e2 = new Emp("Peter", 30, "LA");
		System.out.println(e2.name + " " + e2.age + " " + e2.city);

		Emp e3 = new Emp("LISA", 24, "Pune", 12.33, true);
		// With Constructor defined we can restrict the Object creation.
		

		// when is the default constructor called.

	}

}
