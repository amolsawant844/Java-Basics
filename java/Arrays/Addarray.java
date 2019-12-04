package Arrays;
import java.util.*;
public class Addarray {


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of first and second array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        int i;
        System.out.println("enter elements in the first array");
        for(i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter elements in the second array");
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        if(m==n)
        {
            int c[]=new int[m];
            
            for(i=0;i<n;i++)
            {
                c[i]=a[i]+b[i];
            }
            for(i=0;i<n;i++)
            {
                System.out.println(c[i]);
            }
        }
        else
            System.out.println("addition not possible");
    }
}


