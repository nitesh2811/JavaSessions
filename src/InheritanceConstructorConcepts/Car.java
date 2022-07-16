package InheritanceConstructorConcepts;

public class Car {
	
	String model;
	double price;
	static final int wheels=4;
	String color;
	
	public Car() {
		
		System.out.println("default const");
	}

	//public Car(double price)
	//{
		//this.price=price;
		
//	}
	public void start() 
	{
	System.out.println("Car----start");
	}
	
	public void stop()
	{
		System.out.println("Car----stop");
	}

}
