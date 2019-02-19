/*
	Filename: 	TestBloodData.java
	Developer: 	Dan Hunt
	Date:		01.30.19
	- Application that tests BloodData.java class
*/

public class TestBloodData
{
	public static void main(String[] args)
	{
		// Declare BloodData object using default constructor
		BloodData test1 = new BloodData();
		
		//Test getters using default constructor
		System.out.println("test1: " + test1.getType() + test1.getRh());
		
		// Test setter and getter using overloaded constructor
		BloodData test2 = new BloodData("A", "-");
		System.out.println("test2: " + test2.getType() + test2.getRh());
	}	
}