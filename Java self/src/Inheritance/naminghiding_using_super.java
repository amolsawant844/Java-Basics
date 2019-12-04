package Inheritance;
class A
{
    int i;
}
class B extends A
{
    int i;//this i hides the i in A
    B(int a,int b)
    {
        super.i=a;//i in a
        i=b;//i in b
    }
    void show()
    {
        System.out.println("i in superclass:"+super.i);
        System.out.println("i in subclass :" +i);
    }
}
public class naminghiding_using_super
{
    public static void main(String[] args) {
        B ob=new B(1,2);
        ob.show();
    }
}
