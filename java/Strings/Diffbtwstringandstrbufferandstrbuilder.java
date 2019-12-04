package Strings;

public class Diffbtwstringandstrbufferandstrbuilder
{

    public static void main(String[] args) {
       
       //String manipulation
       
       long start_time=System.currentTimeMillis();
       
       for(int i=0;i<50000;i++)
       {
           String s1="hello"+"hiee";
           String s2="hie"+"hello";
           String sd="hello"+"hiee";
           String sfg="hie"+"hello";
           
       }
       long end_time=System.currentTimeMillis();
       System.out.println("time taken in milisec by string::"+(start_time-end_time));
       
   // ________________________________________________________________________________________________________//   
       
       //String bufffer

   long start=System.currentTimeMillis();
   
   for(int i=1;i<50000;i++)
   {
       StringBuffer s1=new StringBuffer();
       s1.append("hello");
       s1.append("hie");
       s1.append("hi");
       s1.append("h");
       
       
   }
   long end=System.currentTimeMillis();
       System.out.println("time taken by string buff" + (start-end));
       
       
       //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
       
       //String builder
       long start1=System.currentTimeMillis();
       for(int i=0;i<50000;i++)
       {
           StringBuilder sb1=new StringBuilder();
           sb1.append("gud");
           sb1.append("hiee");
           sb1.append("hiee");
           sb1.append("evn");
           
       }
      long end1=System.currentTimeMillis();
      
       System.out.println("time taken by stringbuilder" +(start1-end1));
       
   }

}
