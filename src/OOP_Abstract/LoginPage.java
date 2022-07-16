package OOP_Abstract;

/**
 * 
 * @author Nitesh Agrawal
 *
 */

//We cannot override the final methods of the parent class
public class LoginPage extends Page {

	@Override
	public void title() {

		System.out.println("LP----title");

	}

	@Override
	public void url() {
		System.out.println("LP----URL");

	}

	public void timeOut() {
		System.out.println("time out is 5 secs");
	}

	public void doLogin() {
		System.out.println("App Login");
	}
}
