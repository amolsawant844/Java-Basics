package StaticNestedClass;

public class Staticnestedclass11 
{
	int i=20; 
	public void fun() 
	{
		System.out.println("In outer class method"); 
	}
	static class Inner1
	{ 
		int j=30;
		public void show() 
		{
			System.out.println("In inner class method");
			Staticnestedclass11 o=new Staticnestedclass11(); //  if you want to make object of outer class here 
			o.fun();
			System.out.println("Outer class member:"+o.i); 
		}
	}
	//end inner class
	public void test() 
	{
		System.out.println("In outer class test method"); 
		Inner1 in=new Inner1(); // if you want to make object of inner class here
		in.show(); 
		System.out.println("Inner class member:"+in.j);
	}
		
}




