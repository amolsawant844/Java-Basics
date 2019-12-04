package Innerclasses;
public class Innerclass_inside_method 
{
    int outerx=100;
    void test()
    {
        for(int i=0 ; i<10 ; i++)
        {
            class Inner
            {
                void display()
                {
                    System.out.println("outer_x:" +outerx);
                }
            }
             Inner i2=new Inner();
             i2.display();
        }
       
        
    }
    public static void main(String[] args)
    {
        Innerclass_inside_method i1=new Innerclass_inside_method();
        i1.test();
        
    }
    
}
