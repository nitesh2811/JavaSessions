package OOP_Encapsulation;
/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Peter";
		e1.age = 20;

		// We cannot access Salary property as it is private
		// This is data hiding with private keyword.
		

		e1.setSalary(100.00);

		System.out.println("Salary is " + e1.getSalary());

		LoginPage lp1 = new LoginPage();

		// Kind of the post call
		lp1.setUsername("Nitesh@512");
		lp1.setPassword("Panasonic@123");

		// kind of the get call
		lp1.doLogin(lp1.getUsername(), lp1.getPassword());

		// User wants to update the password
		// Call set method.

		// kind of the put call
		lp1.setPassword("nitesh281189");
		lp1.doLogin(lp1.getUsername(), lp1.getPassword());

		LoginPage lp2 = new LoginPage();

		System.out.println(lp2.getUsername());
		System.out.println(lp2.getPassword());
		lp2.setPassword("admin123");
		lp2.setUsername("admin");

		lp2.doLogin(lp2.getUsername(), lp2.getPassword());
		
		//Can private methods be access from public layer?
		//Yes this can be done.
		
	}

}
