package Exceptionhandling;
// a program to throw an exception if the no.s encountered is not even
public class user_defined_exception extends Exception 
{
	user_defined_exception(String s)
	{
		super(s);
	}
	public static void main(String args[])
	{
		int a[]= {1,3,4,5,6,7,8};
		int var,i;
		for(i=0;i<a.length;i++)
		{
			try
			{
				var=a[i]%2;
				if(var==0)
				{System.out.println(a[i]+" is Even");}
				else
				{
					user_defined_exception d=new user_defined_exception(a[i]+"is not even");
					throw d;
					
				}
			}
			catch(user_defined_exception k)
			{
				System.out.println("exception is:"+k);
			}
		}
	}
	
}
