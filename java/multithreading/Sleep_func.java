package multithreading;

public class Sleep_func extends Thread 
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("hello");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			System.out.println("exception handled here");
		}
	
	}
	public static void main(String a[])
	{
		Sleep_func s=new Sleep_func();
		s.start();
	}

}
