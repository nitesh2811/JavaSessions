package OOP_Inheritance;

/**
 * 
 * @author Nitesh Agrawal
 *
 */
public class Car extends Vehicle {
	/**
	 * Inherit something from parents , grandparents Child can inherit from the
	 * Parent but Parent cannot inherit from the Child Parent can Inherit from their
	 * Parent only Parent Class is also known as Super Class. In Java multiple
	 * Inheritance is not allowed. Child cannot have multiple Parent MultiLevel
	 * Inheritance is allowed but multiple Inheritance is not allowed
	 * 
	 */

	//If a particual class is having final keyword then it will prohibit inheritance 
	//Mehtod overriding is prevented by final keyword.
	private void price() {

		System.out.println("Car---price");
	}

	public static void speed() {
		System.out.println("Car---Speed");
	}

	public void start() {
		System.out.println("Car----Start");
		price();
	}

	public void stop() {
		System.out.println("Car----Stop");
	}

	public void refuel() {
		System.out.println("Car----Refuel");
	}

	@Override
	public void engine() {

		System.out.println("Car---Engine");
	}
}
