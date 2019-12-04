package Enum;

public class EnumDemo 
{ 
	Day day;       
	public EnumDemo(Day day) 
	{        this.day = day;    
	}       
	public void worker() 
	{        
		switch (day)
		{
		  case MONDAY:               
			  System.out.println("Mondays are bad.");         
			  break;                        
		  case FRIDAY:         
			  System.out.println("Fridays are better.");    
			  break;                     
	      case SATURDAY: case SUNDAY:      
	    	  System.out.println("Weekends are best.");  
	    	  break;                         
	      default:       
	    	  System.out.println("Midweek days are so-so.");
	    	  break; 
		}
	}
	public static void main(String[] args) 
	{
		EnumDemo firstDay = new EnumDemo(Day.MONDAY);     
		firstDay.worker(); 
		EnumDemo thirdDay = new EnumDemo(Day.WEDNESDAY);   
		thirdDay.worker(); 
		EnumDemo fifthDay = new EnumDemo(Day.FRIDAY);    
		fifthDay.worker();   
		EnumDemo sixthDay = new EnumDemo(Day.SATURDAY);    
		sixthDay.worker(); 
		EnumDemo seventhDay = new EnumDemo(Day.SUNDAY);       
		seventhDay.worker(); }

}

