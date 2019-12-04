package Arrays;

import java.util.Scanner;

public class Multidimarradd {
    public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the dimension of first array");
       int m=sc.nextInt();
       int n=sc.nextInt();
       int a[][]=new int[m][n];
       System.out.println("enter the dimension of second array");
       int p=sc.nextInt();
       int q=sc.nextInt();
       int b[][]=new int[p][q];
       int i,j;
       System.out.println("eneter elements of first array");
       for(i=0;i<m;i++)
       {
           for(j=0;j<n;j++)
           {
               a[i][j]=sc.nextInt();
           }
       }
       System.out.println("eneter elements of second array");
       for(i=0;i<p;i++)
       {
           for(j=0;j<q;j++)
           {
               b[i][j]=sc.nextInt();
           }
       }
       if(m==p&&n==q)
       {
           int c[][]=new int[m][n];
           for(i=0;i<m;i++)
           {
               for(j=0;j<n;j++)
               {
                   c[i][j]=a[i][j]+b[i][j];
               }
           }
           for(i=0;i<p;i++)
       {
           for(j=0;j<q;j++)
           {
               System.out.print(c[i][j]);            }
           System.out.println("");
       }
   }
       else
           System.out.println("addition not poss");
   
}
}
