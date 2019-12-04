package Method;
public class Returning_object 
{
    int a;
    Returning_object(int i)
    {
        a=i;
    }
    Returning_object incrby10()
    {
        Returning_object temp=new Returning_object(a+10);
        return temp;
    }
    public static void main(String[] args) {
        Returning_object ob1=new Returning_object(25);
        Returning_object ob2;
        ob2=ob1.incrby10();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2=ob2.incrby10();
        System.out.println("ob2.a after second increase " + ob2.a);
        
    }
    
}
