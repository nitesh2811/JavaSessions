package JavaBasics;

public class Browser {


	public String name;
	private int price;
	protected int LicNumber;
	String colour;

	public static void main(String[] args) {


		Browser c = new Browser();
		
		c.colour= "Red";
		c.name= "Nexon";
		c.LicNumber = 12345;
		c.price= 1200000;
		System.out.println(c.price);
	}
}




