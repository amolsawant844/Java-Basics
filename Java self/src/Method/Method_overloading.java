package Method;
public class Method_overloading
{
    void dem()
    {
        System.out.println("you are in non parameterized method");
    }
    void dem(int a)
    {
        System.out.println("you are in parameterized method:"+a);
    }
    void dem(int a,int b)
    {
        System.out.println("you are in parameterized method:"+a +b);
    }
    public static void main(String[] args) {
        Method_overloading m=new Method_overloading();
        m.dem();
        m.dem(3);
        m.dem(4, 5);
    }
    
}
