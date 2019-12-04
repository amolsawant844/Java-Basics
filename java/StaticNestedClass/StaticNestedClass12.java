package StaticNestedClass;

public class StaticNestedClass12
{
	public static void main(String[] args)
	{
		Staticnestedclass11 o=new Staticnestedclass11();
		o.test(); 
		Staticnestedclass11.Inner1 in=new Staticnestedclass11.Inner1(); // if you want to make object of inner class here 
		in.show(); 
	}


}
