package Methodoverrriding;

public class Resolvingmethodoverridingatcompiletime2 extends Resolvingmethodoverridingatcompiletime1
{
	String certification; 
	public void setPolicy()
	{ 
		super.setPolicy();   // call goes to superclass method
		super.getPolicy();
		System.out.println("new policies are:");
		probessionperiod=2;
		casualleaves=8;
		qualification="Degree";
		certification="J2EE"; 
	}
	public void getCertification() 
	{
		System.out.println("Certification should be:"+certification);
	}


}
