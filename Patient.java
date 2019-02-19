/*
	Filename: 	Patient.java
	Developer: 	Dan Hunt
	Date:		01.30.19
	- This application creates a new patient class that uses the BloodData object within the Patient object
*/

public class Patient
{
	// Variables for a patient
	private int id;
	private int age;
	private BloodData bloodData;
	
	// Default constructor
	public Patient()
	{
		id = 0;
		age = 0;
		bloodData = new BloodData("O", "+");
	}
	
	// Overloaded constructor that accepts all patient variables and BloodData variables
	public Patient(int num, int years, String bloodType, String RhType)
	{
		id = num;
		age = years;
		bloodData = new BloodData(bloodType, RhType);
	}
	
	// Accessors or getters
	public int getId()
	{
		return id;		
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getBlood()
	{
		return bloodData.getType();
	}
	
	public String getType()
	{
		return bloodData.getType();
	}
	public String getRh()
	{
		return bloodData.getRh();
	}	
}