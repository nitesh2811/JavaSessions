package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndiaMedical {

	// Fortis is Child of the Interface
	// Mandorty to implement the methods of Interface
	// Responisibility of Child Class to Implement the methods
	// We can have a common method in all the interfaces in that case
	// child class has to implement only one method.
	// Sequence is first extends then implements
	@Override
	public void physioServices() {

		System.out.println("FH----PhyisoServices");
	}

	@Override
	public void cardioServices() {

		System.out.println("FH----CardioServices");

	}

	@Override
	public void entServices() {

		System.out.println("FH----entServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH----oncologyServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH----pediaServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("FH----dentalServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH----neuroServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH----emergencyServices");

	}

	// FH:Individual Methods

	public void optServices() {
		System.out.println("FH----optServices");
	}

	public void medicalInsurance() {
		System.out.println("FH---medicalInsurance");
	}

	// method-hiding.No overriding of static methods
	public static void billing() {
		System.out.println("FH---Billing");
	}

	@Override
	public void medicalTraining() {
		System.out.println("FH----medical training");
	}

	@Override
	public int getPatientNo(String name) {

		if (name.equals("Nitesh")) {
			return 100;
		}

		return -1;
	}

	@Override
	public void covid19Vaccine() {
	System.out.println("covid19-----Vaccine");
		
	}

	@Override
	public void covid19Research() {
	System.out.println("FH----Covid19 Research");
		
	}

	
}
//How exactly we are hiding the implementation with abstraction concept.


