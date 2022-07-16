package WebDriver_Arch;
/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class AmazonAppTest {
	static Webdriver driver;

	public static void main(String[] args) {

		String browser = "chrome";

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("FireFox")) {
			driver = new FireFoxDriver();
		} else if (browser.equals("Safari")) {
			driver = new SafariDriver();
		}

		else {
			System.out.println("Please pass the correct browser.." + browser);
		}
	}

}
