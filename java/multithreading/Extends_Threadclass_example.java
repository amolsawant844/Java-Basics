package multithreading;

public class Extends_Threadclass_example extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("*");
		}
	}
	public static void main(String args[])
	{
		Extends_Threadclass_example a=new Extends_Threadclass_example();
		a.start();//job of child thread
		for(int k=0;k<3;k++)//job of main thread
		{
			System.out.println("@");
		}
	}

}
//note- here the output cant be predicted ...which thread will get executed first cant be predicted