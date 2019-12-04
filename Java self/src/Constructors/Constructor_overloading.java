package Constructors;
public class Constructor_overloading
{
    double width,height,depth;
    Constructor_overloading(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Constructor_overloading()
    {
        width=height=depth=-1;
    }
    Constructor_overloading(double l)
    {
        width=height=depth=l;
    }
    double volume()
    {
        return width*height*depth;
    }
    public static void main(String[] args) {
        Constructor_overloading c=new Constructor_overloading(10,20,30);
        Constructor_overloading c1=new Constructor_overloading();
        Constructor_overloading c2=new Constructor_overloading(4);
        double vol;
        vol=c.volume();
        System.out.println(vol);
        vol=c1.volume();
        System.out.println(vol);
        vol=c2.volume();
        System.out.println(vol);
    }
    
}
