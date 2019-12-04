package Method;
public class Parameterized_method 
{
    int returning(int a)
    {
        
        System.out.println("enter a value");
        
        a=a*a;
        return a;
    }
    public static void main(String[] args) {
        Parameterized_method r=new Parameterized_method();
        int v=r.returning(5);
        System.out.println(v);
    }
    
}
