package multithreading;

public class Which_output_first extends Thread 
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("*");
        }
        
    }
    public static void main(String[] args)
    {
    	Which_output_first wo=new Which_output_first();
        wo.start();
        for(int i=0;i<7;i++)
        {
            System.out.println("$");
        }
        
    }
    


}//note- here the output cant be predicted ...which thread will get executed first cant be predicted
