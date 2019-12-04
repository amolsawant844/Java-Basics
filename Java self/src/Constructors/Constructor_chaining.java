package Constructors;
public class Constructor_chaining 
{
    Constructor_chaining()
    {
        System.out.println("you are in default constructor");
    }
    Constructor_chaining(int x)
    {
        this();
        System.out.println("single parameterized");
    }
    Constructor_chaining(int a,int b)
    {
        this(a);
        System.out.println("double parametrized");
    }
    public static void main(String[] args) {
        Constructor_chaining c=new Constructor_chaining(20,10);
        
    }
    
}
