package multithreading;

public class Creating_thread_implementsrunninterface implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("Thread is in running state");
		
	}
	public static void main(String args[])
	{
		Creating_thread_implementsrunninterface o=new Creating_thread_implementsrunninterface();
		Thread t1=new Thread(o);
		t1.start();
	}

}
//here we create the object of our normal class and object of our thread class 
// and th pass the object of our normal class as argument while creating the object of thread class