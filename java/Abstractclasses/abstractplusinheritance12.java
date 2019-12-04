package Abstractclasses;

public class abstractplusinheritance12 extends abstractplusinheritance11
{

	@Override
	public void nonbody()
	{
		// TODO Auto-generated method stub
		System.out.println("nonbody function overrided");

		
	}
	public static void main(String args[])
	{
		abstractplusinheritance11 e=new abstractplusinheritance12();
        e.body();
        e.nonbody();

	}

}
