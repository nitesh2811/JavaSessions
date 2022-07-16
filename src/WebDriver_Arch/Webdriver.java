package WebDriver_Arch;

public interface Webdriver extends SearchContext {

	public void click();

	public void sendKeys(String value);

	public String getTitle();

	public String getUrl();

	public void quit();

}
