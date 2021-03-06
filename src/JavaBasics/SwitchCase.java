package JavaBasics;

public class SwitchCase {
	public static void main(String[] args) {
		String browser = "chrome";

		// browser is given a input by the user
		switch (browser.toLowerCase().trim()) {// chrome

		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch IE");
			break;
		default:
			System.out.println("please pass the right browser....");
			break;
		}

		//
		short marks = 100;
		switch (marks) {// output will be fail for 100 as switch case is not used to check the
						// condition. It just performs the switch operation.
		case 90:
			System.out.println("GRADE A");
			break;
		case 80:
			System.out.println("GRADE B");
			break;
		case 70:
			System.out.println("GRADE C");
			break;
		case 60:
			System.out.println("GRADE D");
			break;

		default:
			System.out.println("FAIL");
			break;
		}

		// Use case of Switch is ENV selection:
		String env = "QA";

		switch (env) {
		case "QA":
			System.out.println("run tcs on qa env...");
			int a = 10;
			int b = 20;
			int c = a + b;
			break;
		case "DEV":
			System.out.println("run tcs on qa env...");
			break;
		case "STAGE":
			System.out.println("run tcs on qa env...");
			break;
		case "UAT":
			System.out.println("run tcs on qa env...");
			break;
		case "PROD":
			System.out.println("run tcs on qa env...");
			break;

		default:
			break;
		}

		// RBAC -- user permission
		String role = "admin";// superadming, cus, vendor, parntner, seller

	}
}
