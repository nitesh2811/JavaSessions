package WebDriver_Arch;

public class ChromeDriver implements Webdriver {

	public ChromeDriver() {
		System.out.println("Launch Chrome Browser");
	}

	@Override
	public void findElement(String element) {
		System.out.println("Click on Element");

	}

	@Override
	public void findElements(String element) {

	}

	@Override
	public void click() {

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
		System.out.println("enter value: " + value);

	}
}
