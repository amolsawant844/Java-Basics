package multithreading;

public class Join_func extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("thread is in running state");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String a[])
	{
		Join_func t1=new Join_func();
		Join_func t2=new Join_func();
		Join_func t3=new Join_func();
		try
		{
			t1.start();
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println("exception after t1 join() calls");
		}
		try
		{
			t2.start();
			t2.join(9000);
		}
		catch(Exception e1)
		{
			System.out.println("exception after t2 join() calls");
		}
		t3.start();
		

	}

}
