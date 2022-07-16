package OOP_Abstract;
/**
 * 
 * @author Nitesh Agrawal
 *
 */

public abstract class Page {
	/**
	Abstract methods + non abstract methods
	can not create the object of abstract class.
	We can create the constructor of the abstract class.
	This constructor will be called when we create the object of child class
	With super keyword we can call any parameterized or non parameterized constructor also
	of the Parent Class.
	We can have 0 abstract method--0% abstraction
	We can have only abstract methods--100% abstraction
	Mixture of both abstract and non abstract methods--partial abstraction.
	Interface are always 100 % abstraction in Java.
	When we talk about two different systems, Interfaces is used.
	When we talk about same system with different layers then abstract class is used.
	
	 */
	
	public Page()
	{
	System.out.println("Page Class Constructor");	
	}
	
	public Page(int a)
	{
		System.out.println("1 parameter constructor.");
	}
	public abstract void title();
	
	public abstract void url();
	
	public void timeOut()
	{
		System.out.println("page time out is 10 secs");
	}
	
	public final void logo()
	{
		System.out.println("page logo");
	}	
	
}
