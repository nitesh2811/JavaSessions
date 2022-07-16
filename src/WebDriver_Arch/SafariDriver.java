package WebDriver_Arch;

public class SafariDriver implements Webdriver{
	
	public SafariDriver() {
		System.out.println("Launch Safari Browser");
	}

	@Override
	public void findElement(String element) {
		System.out.println("Finding the element:"+element);

	}

	@Override
	public void findElements(String element) {
		System.out.println("Finding the element:"+element);

	}

	@Override
	public void click() {
		System.out.println("Clicking on the element");

	}

	@Override
	public String getTitle() {

		return "title";
	}

	@Override
	public String getUrl() {

		return "http://www.google.com";
	}

	@Override
	public void quit() {
		System.out.println("quit browser");

	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Enter Value: " + value);

	}

}
