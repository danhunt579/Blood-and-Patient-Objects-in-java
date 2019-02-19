/*
	Filename: 	BloodData.java
	Developer: 	Dan Hunt
	Date:		01.30.19
	- This class holds blood types (0, A ,B, AB) and Rh Factor (+ or -)	
*/

public class BloodData
{
	// Variables for blod type and Rh
	private String type;
	private String Rh;
	
	// Default constructor
	public BloodData()
	{
		type = "O";
		Rh = "+";
	}
	// Overloaded constructor
	public BloodData(String bloodType, String RhType)
	{
		type = bloodType;
		Rh = RhType;
	}
	
	// Accessors or getters
	public String getType()
	{
		return type;
	}
	
	public String getRh()
	{
		return Rh;
	}
	
	// Mutators or setters
	public void setType(String bloodType)
	{
		type = bloodType;
	}
	
	public void setRh(String RhType)
	{
		Rh = RhType;
	}	
}