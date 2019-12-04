package Constructors;

public class Constructorchaining 
{
	Constructorchaining()
	{
		System.out.println("defaut");
	}
	Constructorchaining(int x)
	{
		this();
		System.out.println("single");
		System.out.println("value of x in single parameterized constructor:"+x);
	}
	Constructorchaining(int x,int y)
	{
		this(y);
		System.out.println("double");
		System.out.println("value of x and y in double parameterized constructor:"+x+y);
	}
	
	public static void main(String args[])
	{
		Constructorchaining c=new Constructorchaining(10,12);
	}

}
