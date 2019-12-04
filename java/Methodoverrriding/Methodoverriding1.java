package Methodoverrriding;

public class Methodoverriding1 
{
int probessionperiod;
int casualleaves;
String qualification;
	public void setPolicy() 
	{
		probessionperiod=1; 
		casualleaves=15;
		qualification="M.E.";
	}
	public void getPolicy()
	{
		System.out.println("Probession period will be: "+probessionperiod+" months"); 
		System.out.println("Casual leaves are: "+casualleaves+" in a year"); 
		System.out.println("Qualification must be: "+qualification); 
	}


}
