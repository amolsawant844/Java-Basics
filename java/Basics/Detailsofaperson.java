package Basics;
import java.util.Scanner;
public class Detailsofaperson {
    static String n;
    static int d,m,y;
    static long p;
    Scanner sc=new Scanner(System.in);
    void data()
    {
         n=sc.next();
         d=sc.nextInt();
         m=sc.nextInt();
         y=sc.nextInt();
         p=sc.nextLong();
       
    }
    void print()
    {
            System.out.println("name:"+n);
             System.out.println("dob:"+d+"/"+m+"/"+y);
              System.out.println("phone:"+p);
               
    }
    public static void main(String[] args) 
    {
        Detailsofaperson d=new Detailsofaperson();
        d.data();
        d.print();
    }
 
}
