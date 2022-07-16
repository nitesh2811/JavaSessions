package OOP_Interface;

public interface USMedical extends WHO {

	// Interface variables by default static in nature
	// Interface variables are also final in nature by default.
	// Default method are allowed only in Interfaces
	//final modifier is not applicable for the abstract methods 
	//final and abstract combination is illegal in Java.
	//private abstract is illegal modifier.It cannot be overriden 
	int min_fee = 100;

	//No Method body in Interface
	//Only Method declaration/method prototype
	//abstract methods
	//This concept is called abstraction in Java 
	//Class responsibility to give the method body.
	//Interface cannot have a Parent Class
	//Interface can have only Parent Interface
	public void physioServices();

	public void cardioServices();

	public void entServices();

	public void emergencyServices();
	
	public int getPatientNo(String name);
	
	@Override
	public void covid19Research();

	private void testing()
	{
		System.out.println("testing");
	}

	//Above methods are called abstract methods

	//after jdk 1.8

	//1.we can have static method with method body
	//We cannot override the static method
	public static void billing() {
		System.out.println("US---Billing");
	}

	// 2. default method with method body
	//we can override the default method also.
	default void medicalTraining() {
		System.out.println("US----medical training");
	testing();
	}

}
