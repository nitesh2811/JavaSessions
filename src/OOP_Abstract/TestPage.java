package OOP_Abstract;

/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class TestPage {

	public static void main(String[] args) {

		HomePage hP = new HomePage();
		hP.title();
		hP.timeOut();
		hP.logo();

		LoginPage lp = new LoginPage();
		lp.timeOut();
		lp.title();
		lp.url();
		lp.logo();
		lp.doLogin();
		
		/**
		Page p=new Page();
		we cannot instantiate the object of the abstract class.Strictly now allowed.
		Whenever we create object of child class then absract class no args constructor is called.
		To call the parameterized constructor of the abstract class, we have to use super keyword.
		 */
		
		Page page = new HomePage();
		//Top casting is possible with the abstract class also.
		page.timeOut();
		page.title();
		page.logo();

	}

}
