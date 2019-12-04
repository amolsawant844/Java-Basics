package Method;
public class Object_as_parameter {
 int a,b;
 Object_as_parameter(int i,int j)
 {
     a=i;
     b=j;
 }
 boolean equalTo(Object_as_parameter p )
 {
     if(p.a==a && p.b==b) return true;
     else return false;
 }
    public static void main(String[] args) {
    Object_as_parameter o1=new Object_as_parameter(100,200);
    Object_as_parameter o2=new Object_as_parameter(100,300);
    Object_as_parameter o3=new Object_as_parameter(100,200);
        System.out.println("o1==o2:" + o1.equalTo(o2));
        System.out.println("o1==o3:" + o1.equalTo(o3));
    }
}
