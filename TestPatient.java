/*
	Filename: 	TestPatient.java
	Developer: 	Dan Hunt
	Date:		01.30.19
	- Application that tests the Patient object
*/

public class TestPatient
{
	public static void main(String[] args)
	{
		// Creates a new Patinet object
		Patient p1 = new Patient();
		
		// Tests the getters and object creation
		System.out.println("Patient1:\nID: " + p1.getId() + "\tAge: " + p1.getAge());
		System.out.println("Blood Type: " + p1.getType() + p1.getRh());
		
		// Tests the overloaded constructor
		Patient p2 = new Patient(12345, 23, "A", "-");
		System.out.println("Patient2:\nID: " + p2.getId() + "\tAge: " + p2.getAge());
		System.out.println("Blood Type: " + p2.getType() + p2.getRh());
	}	
}