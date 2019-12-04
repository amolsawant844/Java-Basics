package Arrays;

import java.util.Scanner;

public class Linearsearch {
	   public static void main(String[] args) 
	    {
	     int a[]={1,2,3,4,5};
	     int i;
	     
	     Scanner sc=new Scanner(System.in);
	        System.out.println("enter a number to be found:");
	        int k=sc.nextInt();
	        int c=0;
	     for(i=0;i<5;i++)
	     {
	         if(a[i]==k)
	         {
	             c++;
	             break;
	         }
	     }
	     if(c!=0)
	     {
	         System.out.println("element found at :"+(i+1));
	     }
	     else if(c==0)
	     {System.out.println("element not fou55nd");}
	    }
	 
}
