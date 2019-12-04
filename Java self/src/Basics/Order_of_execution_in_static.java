package Basics;
public class Order_of_execution_in_static 
{
    static int a=3;
    static int b;
    static void method(int x )
    {
        System.out.println("x:" +x);
        System.out.println("a:" +a);
        System.out.println("b:" +b);
    }
    static 
    {
        System.out.println("static block initiaized:");
        b=a*4;
    }
    public static void main(String[] args) {
        method(42);
    }
}
