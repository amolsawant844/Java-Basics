package Functions;

public class Functionoverloading 
{
	void rect()
	{
		System.out.println("you are in non parameterised function");
	}
	void rect(int a)
	{
		System.out.println("you are in parameterised function"+a);
	}
	public static void main(String args[])
	{
		Functionoverloading fo=new Functionoverloading();
		fo.rect();
		fo.rect(5);
	}

}
