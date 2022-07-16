package ConstructorConcepts;
/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class Car {

	public String name;
	public int price;
	public String color;
	public String model;
	public static final int wheels = 4; //static variables will not participate for constructor creation 
										//because of its static nature.Its copy will not be will not be created.
										//Static will be inside common memory allocation.

	
	/**
	 * 
	 * @param name
	 * @param price
	 * @param color
	 */
	public Car(String name, int price, String color) {

		this.name = name;
		this.price = price;
		this.color = color;
	}

	public Car(String name, int price) {
		
		this.name = name;
		this.price = price;
	}

	public Car(String name, String model) {
		
		this.name = name;
		this.model = model;
	}

	public Car(String name, String color,int price) {
	
		this.name = name;
		this.color = color;
		this.price=price;
	}
	
	
}

/**
One Important thing between method and constructor
Will we write business logic in Constructor ?
Business logic is defined inside the method and not inside constructor.
Constructor is used to construct the Object and initialise class variables. 
It makes sense to write logic inside methods.
We can create a default constructor also if needed but this is not recommended 
static is only for the Class properties. It is an illegal modifier for the local variables.
 */

