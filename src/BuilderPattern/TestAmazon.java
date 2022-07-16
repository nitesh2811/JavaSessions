package BuilderPattern;

public class TestAmazon {

	public static void main(String[] args) {
		
		
		//We can create different work Flow for the user.
		//Method Chaining
		EcommApp obj = new EcommApp();
		
		obj.
			login("nagrawal512@gmail.com","nitesh").
				search("laptop").
					addToCart("Asus").
						doPayment("nitesh@icici").
							generateOrderId().
								logOut();
		
		//
		obj.
			login().
				search("iPhone").
					logOut();
	
		obj.
			login().
				logOut();
		//
		EcommApp.closeBrowser();
		//Static method should be access in static way only.
		
		//We can call any method as per our requirement
		//This is called a builder pattern
		//For Work Flow based application we can use builder pattern
		//which returns current object.
		//this can used in contructors , getters and setters and business logic methods also.
	
	}

}
