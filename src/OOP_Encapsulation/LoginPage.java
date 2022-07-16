package OOP_Encapsulation;

/**
 * 
 * @author Nitesh Agrawal
 * 
 */
public class LoginPage {
	// getter and setter doesnt not define the business logic.they help to define
	// private property
	// behaviour is decided by method which is publicly created in the class.

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String un, String pass) {
		System.out.println("Logging in Application with " + un + " " + "Password " + pass);

	}
}
