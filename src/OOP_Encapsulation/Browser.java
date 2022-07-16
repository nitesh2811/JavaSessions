package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser...");
		checkRAM();
		checkOSCompatiable();
		checkBrowserVersion();
		checkBrowserUpdated();
		System.out.println("Browser is launched");
	}
	//Hide Implementation of methods with private keyword
	//we have layers of the methods with private modifier
	//This is also Encapsulation.
	//Advantsge:User is not seeing unnecessary operation
	//2.System is hiding Internal Implementation of the Class.
	
	private void checkRAM() {
		System.out.println("Check RAM");
	}
	private void checkOSCompatiable() {
		System.out.println("check OS compatibility");
	}
	private void checkBrowserVersion() {
		System.out.println("Checking Browser Version");
	}
	private void checkBrowserUpdated() {
		System.out.println("check Browser Updated");
	}
}
