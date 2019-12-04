package inheritancesuperclass;

public class Superclass12 extends Superclass11
{
	double basicsalary; 
	int casualleaves;
	String gender;
	Superclass12(int id, String name, String organisation, String gender) 
	{ 
		super(id,name,organisation,gender); 
	}
	public void setData(double basicsalary, int casualleaves) 
	{
		this.basicsalary=basicsalary;
		this.casualleaves=casualleaves;
	} 
	public void setGender(String gender) 
	{
		super.displayData(); 
		this.gender=gender;
		super.gender=this.gender;
		System.out.println("\nAfter Changing the gender\n");
		super.displayData();
	} 
	public void displatEmpData()
	{ 
		System.out.println("basic salary:"+basicsalary+"\nCasual leaves:"+casualleaves);
	}

	

}
