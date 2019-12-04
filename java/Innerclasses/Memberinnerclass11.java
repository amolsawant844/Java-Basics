package Innerclasses;

public class Memberinnerclass11 
{
	int i=20;
	public void fun() 
	{ 
		System.out.println("In outer class method");
	}
	class Inner
	{ 
		int j=30; 
		public void show()
		{
			System.out.println("In inner class method"); 
			fun(); 
			System.out.println("Outer class member:"+i);
		}
	}//end inner class
	public void test() 
	{
		System.out.println("In outer class test method"); 
		Inner in=new Inner(); // if you want to make object of inner class here
		in.show(); 
		System.out.println("Inner class member:"+in.j);
	}
}


