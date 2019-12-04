package Varargs;
public class varargs_newmethod 
{
    static void vatest(int ... v)
    {
        System.out.println("no. of args:" + v.length);
        System.out.println("contents:");
        for(int x :v)
        {
            System.out.println(x + " ");
        }
    }
    public static void main(String[] args) {
        int n1[]={1,2,3,4};
        int n2[]={1,2};
        int n3[]={};
        vatest(n1);
        vatest(n2);
        vatest(n3);
    }
    
}
/*features:
overloading of varargs methods is poss
varargs takes regular args as well as variable lenght argment*/

