package Interfaces;

public class Extendedinterface13 implements Extendedinterface12
{

	@Override
	public void print() 
	{
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void show() 
	{
		// TODO Auto-generated method stub
		System.out.println("welcome");
	}
	public static void main(String args[])
	{
		Extendedinterface13 ei=new Extendedinterface13();
		ei.print();
		ei.show();
	}

}
