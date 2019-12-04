package Innerclasses;

public class Localinnerclass11 
{
	int i=20;
	void fun()
	{
		System.out.println("In outer class method");
	}
	void test()
	{
		System.out.println("In outer class method");
		class inner1
		{
			int j=30;
			void show()
			{
				System.out.println("In inner class method");
				fun();
				System.out.println("Outer class memeber" +i);
			}
		}
		inner1 in =new inner1();
		in.show();
		System.out.println("Inner class member :"+in.j);
	}

}
