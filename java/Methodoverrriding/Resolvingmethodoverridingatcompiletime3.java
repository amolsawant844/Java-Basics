package Methodoverrriding;

public class Resolvingmethodoverridingatcompiletime3 
{
	public static void main(String[] args)
	{
		Methodoverriding1 to=new Methodoverriding2();   // dynamic binding 
		to.setPolicy();                                                     // call goes to subclass method to.getPolicy();  
		to.getPolicy();
		Resolvingmethodoverridingatcompiletime2 t=(Resolvingmethodoverridingatcompiletime2).to;  
		// downcasting 
		t.getCertification();

	}

}
