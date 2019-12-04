package Exceptionhandling;

public class garbage_collection
{
	public void finalize()
	{
		System.out.println("finalize method executes before gc");
		
	}
	public static void main(String args[])
	{
		garbage_collection g=new garbage_collection();
		g=null;
		System.gc();
	}

}
