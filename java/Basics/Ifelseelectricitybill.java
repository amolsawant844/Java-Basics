package Basics;

import java.util.Scanner;

public class Ifelseelectricitybill {

    static float amt,finalamt;
    Scanner sc= new Scanner(System.in);
    void input()
    {
        int id;
        String name;
        System.out.println("enter your id:");
        id=sc.nextInt();
        System.out.println("enter your name:");
        name=sc.next();
    }
    void cal()
    {
        float u;
    
        System.out.println("enter your unit charge:");
        u=sc.nextFloat();
        if(u<=199)
        {
            amt=(float) (u*1.2);
        }
        else if(u>=200&&u<400)
        {
            amt=(float) (u*1.5);
        }
        else if(u>=400&&u<600)
        {
            amt=(float) (u*1.8);
        }
        else if(u>=600)
        {
            amt=(float) (u*2);
        }
    }
    void finalamt()
    {
        if(amt>400)
        {
            finalamt=amt+(amt*15)/100;
        }
        else
        {
            finalamt=amt;
        }
    }
    public static void main(String[] args)
    {
     Ifelseelectricitybill e=new Ifelseelectricitybill();
     e.input();
     e.cal();
     e.finalamt();
        System.out.println("final bill:"+finalamt);
     
    }
 

}
