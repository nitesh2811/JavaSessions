package BuilderPattern;

public class EcommApp {

	public EcommApp login() {
		System.out.println("Logging to the App");
		//This means return the Current Class Object.
		return this;
	}

	public EcommApp login(String un, String pass) {
		System.out.println("Logging to the App");
		return this;
	}

	public EcommApp search(String productName) {
		System.out.println("Searching Product");
		return this;
	}

	public EcommApp search(String productName, int price) {
		System.out.println("Searching Product");
		return this;
	}

	public EcommApp addToCart(String productName) {
		System.out.println("Product added to Cart");
		return this;
	}

	public EcommApp doPayment(String cc, int otp) {
		System.out.println("Processing payment");
		return this;
	}

	public EcommApp doPayment(String upi) {
		System.out.println("Processing payment");
		return this;
	}

	public EcommApp generateOrderId() {
		System.out.println("Generating Order Id");
		return this;
	}

	public EcommApp logOut() {
		System.out.println("LogOut from the App...");
		return this;
	}
	
	public static void closeBrowser() {
		System.out.println("Quitting the browser");
		
	}
}
