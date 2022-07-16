package InheritanceConstructorConcepts;
/**
 * 
 * 
 * @author Nitesh Agrawal
 *
 */

public class BMW extends Car {
	
	/**
	 *If a constructor does not explicitly invoke a superclass constructor, 
	 *the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
	 *If the super class does not have a no-argument constructor, you will get a compile-time error.
	 *Object does have such a constructor, so if Object is the only superclass, there is no problem.
	 */
	String country;
	String manufactureDate;
	
	//public BMW() {
		
		//System.out.println("default..const");
	//}
	
	public BMW(String country,double price)
	{
		//super(price);
		this.country=country;
	}
	
	public void theftSafety()
	{
		System.out.println("this car is theft safe");
	}
	

}

