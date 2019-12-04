package Method;
public class Call_by_value// value does not change..just the normal calling process
{
    void meth(int i,int j)
    {
        i*=2;
        j/=2;
    }
    public static void main(String[] args) {
        Call_by_value ob=new Call_by_value();
        int a=15,b=20;
        System.out.println("a nd b before call:" + a + " " + b);
        ob.meth(a, b);
        System.out.println("a nd b after call:" + a + " " + b);
    }
    
}
