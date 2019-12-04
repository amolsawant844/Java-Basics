package Inheritance;

public class Multilevelinheritance13 extends Multilevelinheritance12
{
	  public Multilevelinheritance13()
	  {          
		  System.out.println("Maruti Model: 800"); 
	  } 
	  public void speed()
	  {           
		  System.out.println("Max: 80Kmph");
	  }    
	  public static void main(String[] args)
	  {
	        
		 Multilevelinheritance13  obj=new Multilevelinheritance13 ();  
		 obj.vehicleType();
		 obj.brand(); 
		 obj.speed();   
      } 

}
