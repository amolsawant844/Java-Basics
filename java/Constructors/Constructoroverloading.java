package Constructors;

public class Constructoroverloading 
{

	Constructoroverloading()
	{
		System.out.println("Rectangle object initialization");
		
	}
	Constructoroverloading(int a)
	{
		 System.out.println("you are in parameterized constructor:"+a);
		
	}
	 public static void main(String args[])
	 {
		 Constructoroverloading p=new Constructoroverloading ();
		 Constructoroverloading p1=new Constructoroverloading (5);
	 }

}
