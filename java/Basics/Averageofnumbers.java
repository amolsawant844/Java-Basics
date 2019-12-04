package Basics;
import java.util.Scanner;
public class Averageofnumbers 
{

	


	    public static void main(String[] args) 
	    {
	        int a,b,c,d,e;
	        float avg;
	        System.out.println("enter 5  nos:");
	        Scanner sc= new Scanner(System.in);
	        a=sc.nextInt();
	        b=sc.nextInt();
	        c=sc.nextInt();
	        d=sc.nextInt();
	        e=sc.nextInt();
	        avg=(float)(a+b+c+d+e)/5;
	        System.out.println("avergae is:"+avg);
	    }
	

}
