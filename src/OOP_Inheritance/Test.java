package OOP_Inheritance;

/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class Test {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();// Child Class Start method is called
					// It is known as method overriding in Java

		b.stop(); // Inherited method.

		b.refuel();// Inherited method.

		b.autoParking();// Individual method of BMW Class

		b.engine();// Access the properties of the Grand Parent.
					// Override the method from Grand Parent.

		BMW.speed();// Static method is called by Class Name.
		Car.speed();// Static method calling for Car Class.

		// Object of Car Class
		Car car = new Car();
		car.start(); // It will call Car Class start method
		car.refuel();
		car.engine();

		System.out.println("------------------------------------");
		// Parent cannot take anything from Child Class
		// Only Child Class properties can be accessed here
		// Cannot access the Private methods also.

		// Child Class Object can be refered by Parent Class Reference varibales
		// Top Casting
		Car c1 = new BMW();
		c1.start();// Overriden Method is called.
		// here the Object is BMW and c1 is just refernce variable.
		c1.stop();
		c1.refuel();
		// cannot access c1.autoParking method
		// Reference Type Check concept is applied here.
		// Can access overriden method and Inherited method.
		// when trying to access the method of BMW Object Java will check the type of
		// the
		// reference variable.Here refernece varibale is c1.
		// Here we will have refence mismatch.

		Vehicle v = new BMW();
		v.engine();
		// Cannot not access start stop properties

		System.out.println("************************************");

		// Down Casting
		// This is not allowed.
		// Every car is not BMW , hence Error
		// Conversion of Car in BMW
		// BMW b1=(BMW) new Car();//Conversion of Car Object to BMW
		// b1.start();
		// Output is Class Cast Exception
		// Down casting is not allowed in Java.
		// During Run time we have exception
		// Down casting at the compile time is allowed.This is way how Java is defined.

		// We never use down casting in Selenium
		// why is the down casting given by the Java is not used ?

		// BMW b2=(BMW) new Vehicle();

		Audi audi = new Audi();
		audi.start();
		audi.engine();
		audi.refuel();
		audi.theftSafety();

		// Siblings cannot exchange property with each other
		// Class that inherit same Parents are siblings
		// Siblings inheritance is not

	}
}
