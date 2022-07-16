package OOP_Encapsulation;

public class TestUser {

	public static void main(String[] args) {
		//Main method behaves as a runner 
		//Main method is never created inside the user class.
		//Its acts as a runner for other Classes.
		// Constructor is behaving like a Setter.
		User u1 = new User("kiran", "jadeja", 90909, true);
		System.out.println(u1.isPrime());
		System.out.println(u1.getPhoneNo());

		// Its not mandatory to have setter but advantage is to update the value
		// of the private data variable.
		// Setter will help in update use cases.

		u1.setPhoneNo(80809090);
		u1.setPrime(false);

		System.out.println(u1.isPrime());
		System.out.println(u1.getPhoneNo());

		u1.getUserProfile();

		u1.setPrime(true);

		u1.getUserProfile();

	}

}
