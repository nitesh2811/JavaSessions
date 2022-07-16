package OOP_Abstract;

public class HomePage extends Page {

	/**
	 * Default constructor will be created internally. First preference to parent
	 * class constructor and then child class Constructor.
	 */

	public HomePage() {

		System.out.println("HomePage---Constructor");
	}

	@Override
	public void title() {
		System.out.println("HP----home page title");
	}

	@Override
	public void url() {

		System.out.println("HP----home page URL");
	}

	@Override
	public void timeOut() {
		System.out.println(" time out is 20 secs");
	}

}
