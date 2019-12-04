package inheritancesuperclass;

public class Superclass11
{
	int id ;
	String name,organisation,gender;
	
	Superclass11()
	{
		
	}
	Superclass11(int id,String name,String organisation,String gender)
	{
		this.id=id; 
		this.name=name;
		this.organisation=organisation;
		this.gender=gender;

	}
	public void displayData()
	{
		System.out.println("Id:"+id+"\nname:"+name+"\norganization:"+organisation+"\ngender:"+gender) ;
	} 
	

}
