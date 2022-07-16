package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
	FortisHospital fh=new FortisHospital();
	fh.cardioServices();
	fh.dentalServices();
	fh.emergencyServices();
	fh.neuroServices();
	fh.medicalInsurance();
	fh.medicalTraining();
	int num=fh.getPatientNo("Nitesh");
	System.out.println(num);
	System.out.println(USMedical.min_fee);
	
	FortisHospital.billing();
	USMedical.billing();
	fh.medicalEquipment();
	fh.medicalStudy();
	
	fh.covid19Vaccine();
	
	System.out.println("--------------------------------------------------");
	
	//We cannot create the Object of Interface in Java
	//This is not allowed in Java
	
	
	//USMedical us=new USMedical(); will give error
	
	//Top Casting
	//Child class object can be referred by parent class
	//reference variable
	USMedical us=new FortisHospital();
	us.physioServices();
	us.cardioServices();
	us.entServices();
	us.emergencyServices();
	us.medicalTraining();
	
	//We cannot access the method of UK,India for Fortis Hospital 
	//This is beacuse of the Referrence Type Check
	
	//Down Casting 
	//We cannor create the Object of Interface
	//down casting is not possible 
	
	//abstract method cannot be static in nature
	//We cannot override static methods.Strictly not allowed
	
	
	
	}

}
