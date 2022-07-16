package ConstructorConcepts;

/**
 * 
 * @author Nitesh Agrawal
 *
 */

//Within same package we cannot create duplicate classes.
//Same class name can exist in different packages.
public class Employee {

	String name;
	int age;
	String city;
	double sal;
	boolean isPem;

	/**
	 * Constructor of the class name will be same as the class name Constructor is
	 * not a function. Function name can be anything but constructor name is class
	 * name We dont write return type with constructor. No return keyword applicable
	 * for constructor Constructor Overloading is possible 
	 * Constructor will be called when we create the Object of class.
	 * Creating default constructor is like inviting anyone to create the Object of the Class
	 * Not recommended in the programming.
	 */

	public Employee() //Zero Parameter constructor not a default constructor.
	{
		System.out.println("default Constructor");
	}

	public Employee(int a) 
	{
		System.out.println("1 param Constructor " + a);
	}

	public Employee(int a, int b) 
	  { 
		System.out.println("2 param Constructor " +(a + b));
	  }
	  
	public static void main(String[] args) {

		// Plain Object
		Employee obj = new Employee();
		Employee obj1 = new Employee(10);
		Employee obj2 = new Employee(10,20);

		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);

	}

}
