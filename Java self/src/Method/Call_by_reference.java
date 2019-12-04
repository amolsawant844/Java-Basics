package Method;
public class Call_by_reference// value changes...object ka reference is passed
{
    int a,b;
    Call_by_reference(int i,int j)
    {
        a=i;
        b=j;
    }
    void meth(Call_by_reference o)
    {
        o.a*=2;
        o.b/=2;
    }
    public static void main(String[] args) {
        Call_by_reference ob=new Call_by_reference(15,20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
