package Exceptionhandling;

public class tryndcatch
{
	/*
    java.lang(package)
        |
    throwable(class)
        |

    exception(class)
        |
    checked(types of errors)
    unchecked
    error
    
    */
	public static void main(String args[])
	{
		try
		{
			int a=10;
			a=a/0;
		}
		catch(Exception e)//exception(class present in java.lang pack,e is the object created)
		{
			System.out.println(e);
			e.printStackTrace();//to print which type of error and where the error has occured
		}
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			String k="welcome";
			int i=Integer.parseInt(k);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		try
		{
			int a[]=new int[10];
			a[100]=100;
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
    
	}

}



