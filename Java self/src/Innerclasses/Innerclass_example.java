package Innerclasses;
public class Innerclass_example
{
    int out=100;
    void test()
    {
        Inner i=new Inner();
        i.display();
    }
    class Inner
    {
        void display()
        {
            System.out.println("out:"+out);
        }
    }
    public static void main(String[] args)
    {
        Innerclass_example i1=new Innerclass_example();
        i1.test();
    }
    
}
