package Constructors;

public class Thiskeyword
{
	int a,b;
	Thiskeyword(int a,int b)
	{
		System.out.println("this keyword assigns the value of local variable to the instance variable");
		this.a=a;
		this.b=b;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Thiskeyword tk=new Thiskeyword(5,10);
	}

}
