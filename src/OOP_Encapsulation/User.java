package OOP_Encapsulation;

/**
 * 
 * @author Nitesh Agrawal
 *
 */
public class User {
	// This class also has encapsulated data.

	private String firstName;
	private String lastName;
	private int phoneNo;
	private boolean isPrime;

	// We can create Constructor also of private data members

	public User(String firstName, String lastName, int phoneNo, boolean isPrime) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.isPrime = isPrime;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	public void getUserProfile() {
		System.out.println(firstName+" "+lastName+" "+phoneNo+" "+isPrime);

	}
	
}
