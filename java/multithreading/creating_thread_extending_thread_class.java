package multithreading;

public class creating_thread_extending_thread_class extends Thread
{
	public void run()
	{
		System.out.println("thread is in running state");
	}
	public static void main(String args[])
	{
		creating_thread_extending_thread_class t1=new creating_thread_extending_thread_class();
		t1.start();
		
	}

}//note- here we create the object of our normal class
/*
 design of thread class which has been extended
 	Abstract class Thread
 	{
 		public abstract void run();
 		public void start()
 		{
 		_____;
 		_____;	also contains a func to call run
 		_____;
 		}
 	}
*/