
package Method;

public class Returning_a_value
{
    int returning()
    {
        
        System.out.println("enter a value");
        int a=10;
        a=a*a;
        return a;
    }
    public static void main(String[] args) {
        Returning_a_value r=new Returning_a_value();
        int v=r.returning();
        System.out.println(v);
    }
    
}
