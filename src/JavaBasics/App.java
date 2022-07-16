package JavaBasics;

/**
 * 
 * @author Nitesh Agrawal
 *
 */
public class App {
	/**
	 * Instance method can call each other without Object creation as they are part
	 * of the Object.Static methods are stored in MetaSpace and hence they cannot
	 * call the Instance methods directly. On the Other hand the static methods can
	 * call other Static methods without the need of Object Creation
	 * This concept of calling one method inside another method is called as 
	 * Method chaining
	 */
	public void t1() {
		System.out.println("t1 method");
		t2();
	}

	public void t2() {
		System.out.println("t2 method");
		t3();
	}

	public void t3() {
		System.out.println("t3 method");
		t1();// StackOverflowError
	}

	public static void m1() {
		System.out.println("m1 method");
		m2();
	}

	public static void m2() {
		System.out.println("m2 method");
		m3();
	}

	public static void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		App obj = new App();
		obj.t1();
		App.m1();// Static method can be called by the Class Name and object
				 // creation is not required.
	}

}

/**
 * During the excution of methods Stack is used and we have StackOverFlow error
 * when the number of executions is more than memory size. It works on the
 * principle of LIFO:Last in first out.
 */
