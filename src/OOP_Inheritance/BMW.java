package OOP_Inheritance;

public class BMW extends Car
//extends is keyword 
//BMW is sub class and Car is Super class.
//Method Overriding comes into picture when we have
//Parent class and child class
//If @Override does not give any Error then it means method is overriden
//If it gives Error and then method is not overriden 
//Private methods from Parent Class cannot be overriden in Child Class.
//Staic methods cannot be Overriden in Java.
//Static method can be overloaded but not overriden
//Method hiding-when same static method is used in Parent and Child class 
//In Java if Parent Class is having static mehtod and same method
//is present in Child Class then its method hiding but not method overriding.
//Method overriding is also Polymorphism (different forms of same method)
//Method Overloading-Static polymorphism-Compile time polymorphism
//Method Overriding-Dynamic polymorphism-Run time polymorphism
//Dynamically at the run time it is decided that overidden method is called 
//Compiler does not decide in Run time polymorphism

{
	@Override // start method is overriden method here.(Same method signature and return type)
	public void start() {
		System.out.println("BMW----Start");

	}
	
	//We cannot write @Override as there is no such method in Parent Class.
	public void start(int a) {
		System.out.println("BMW----Start");

	}

	public void autoParking() // Individual method of BMW Class.
	{
		System.out.println("BMW----AutoParking");
	}

	@SuppressWarnings("unused")
	private void price() {
		System.out.println("BMW...Price");
	}

	// method hiding:Will not hide anything just a concept.
	public static void speed() {
		System.out.println("Car--Speed");
	}

	@Override
	public void engine() {
		System.out.println("BMW---Engine");
	}
}

//Method-Overriding:When we have a method in parent class as well as in child class 
//with the same name
//with the same number of parameters
//with same return type
//To prove method is overriden use @Override annotation
