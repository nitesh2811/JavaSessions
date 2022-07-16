package JavaBasics;

public class ConditionalOperators {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		
		//With If-else we always use boolean values or the boolean condition.
		if (b > a) {// false
			System.out.println("b is gr than a");
		} else {
			System.out.println("a is gr than b");
		}

		if (a == b) {// false
			System.out.println("both are eq");
		} else {
			System.out.println("not eq");
		}

		//if (true) {
			//System.out.println("Hi..");
		//} else {// dead code because in this case else block will never be executed.
			//System.out.println("Bye..");
		//}

		boolean flag = false;
		if (flag) {
			System.out.println("testing...");
		} else {
			System.out.println("dev...");
		}
		//Nested If-else is used if we have condtion inside a condition or nested condition.
		int marks = 100;
		if (marks >= 90) {
			if (marks >= 95) {
				System.out.println("GRADE A++");
			} else {
				System.out.println("GRADE A");
			}
		} else {
			System.out.println("GRADE B");
		}

		// WAP: three different numbers
		// find out the max number:
		int x = 500;
		int y = 400;
		int z = 600;
		//If else-if is used if we have multiple if conditions to be checked.
		if (x > y && x > z) {// true && false = false
			System.out.println("x is the greatest");
		} else if (y > z) {// false
			System.out.println("y is the greatest");
		} else {
			System.out.println("z is the greatest");
		}

		// only multiple IFs:
//		String browser = "chrome";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome...");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch ff...");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("launch safari...");
//		}
//		if(browser.equals("IE")) {
//			System.out.println("launch IE...");
//		}
//		else {
//			System.out.println("please pass the right browser....");
//		}

		// if-else if
		//but still this is not efficient becuase all the if condition will be checked by the JVM from start to bottom.
		String browser = "firefox";
		if (browser.equals("chrome")) {
			System.out.println("launch chrome...");
		} else if (browser.equals("firefox")) {
			System.out.println("launch ff...");
		} else if (browser.equals("safari")) {
			System.out.println("launch safari...");
		} else if (browser.equals("IE")) {
			System.out.println("launch IE...");
		} else {
			System.out.println("please pass the right browser....");
		}

	}

}
