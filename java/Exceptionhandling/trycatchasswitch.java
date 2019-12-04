package Exceptionhandling;

public class trycatchasswitch 
{
	 public static void main(String[] args) 
	    {
	        try
	        {
	           int a[]=new int[100];
	           a[1000]=4;
	           int ans=5/0;
	           
	        }
	        
	         catch(ArithmeticException e)
	        {
	            System.out.println("Arithmetic exception handled");
	            e.printStackTrace();
	            
	        }
	        
	         
	        
	        catch(Exception e1)
	        {
	        	System.out.println("exception handled");
	            e1.printStackTrace();
	        }
	        
	    }
	 

}
