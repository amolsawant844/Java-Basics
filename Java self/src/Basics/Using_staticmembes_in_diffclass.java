package Basics;
public class Using_staticmembes_in_diffclass
{
    public static void main(String[] args) {
        a.callme();
        System.out.println("b="+a.b);
    }
}
class a
{
    static int a=42;
    static int b=99;
    static void callme()
    {
        System.out.println("a=" +a);
    }
}
