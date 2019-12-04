
package Method;
public class Method_basic 
{
    double width,height,depth;
    void vol()
    {
        System.out.println("volume is");
        System.out.println( width*height*depth);
    }
    public static void main(String[] args)
    {
        Method_basic m1=new Method_basic();
        m1.depth=10;
        m1.height=10;
        m1.width=10;
        m1.vol();
        Method_basic m2=new Method_basic();
        m2.depth=50;
        m2.height=50;
        m2.width=50;
        m2.vol();
        
    }
    
}
