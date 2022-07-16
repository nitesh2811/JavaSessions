package ConstructorConcepts;

public class TestCar {

	public static void main(String[] args) {

		Car c=new Car("BMW", 0, "red");
		System.out.println(c.color);
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.model);
		
		Car c1=new Car("Honda",100,"White");
		System.out.println(c1.color);
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.model);
		
	}

}
