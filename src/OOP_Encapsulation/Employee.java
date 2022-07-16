package OOP_Encapsulation;
/**
 * 
 * @author Nitesh Agrawal
 *
 */
public class Employee {

	public String name;
	public int age;
	private double salary;// Can be accessed only within Current Class.

	public static void main(String[] args) {

		/**
		 * We want to hide some data of the Class Some properties are private in nature
		 * Private properties cannot be accessed outside of the Class
		 * Encapsulation-Create data class where data is actually private in nature
		 * Outside User can access there private members using public property. Public
		 * property helps to interact with private property Public layer internally
		 * calls the private data and helps to access it Also in same class it doesnt
		 * really matter whether its public or private.
		 * 
		 */

		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 30;
		e1.salary = 30.55;
	}

	/**
	 * 
	 * @return- the salary of the employee Getter and Setter methods for the private
	 *          Instance variables. We need to assign some public layer for access
	 *          of private properties This is where getter and setter methods comes
	 *          handy.
	 * 
	 */
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
