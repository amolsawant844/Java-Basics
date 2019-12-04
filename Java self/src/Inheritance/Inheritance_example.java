package Inheritance;
class Box
{
    double width,height,depth;
    //constructor lon of an objetc
    Box(Box ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    
    //constructor used when all dimensions specified
    Box(double w ,double h ,double d )
    {
        width=w;
        height=h;
        depth=d;
    }
    
    //constructor used when no dimension specified
    Box()
    {
        width=height=depth=-1;
        
    }
    
    //constructor used when cube is created
    Box(double len)
    {
        width=height=depth=len;
    }
    
    double volume()
    {
        return width*height*depth;
    }
    
}
class Boxweight extends Box
{
    double weight;
    Boxweight(double w,double h,double d,double m)
    {
        width=w;
        height=h;
        depth=d;
        weight=m;
    }
}
public class Inheritance_example 
{
    public static void main(String[] args) 
    {
        Boxweight m1=new Boxweight(10,20,15,34.3);
        Boxweight m2=new Boxweight(2,3,4,0.076);
        double vol;
        
        vol=m1.volume();
        System.out.println("vol of box1: "+vol);
        System.out.println("weight of box1: "+m1.weight);
        System.out.println();
        
        vol=m2.volume();
        System.out.println("vol of box2: "+vol);
        System.out.println("weight of box2: "+m2.weight);
        System.out.println();
    }
}
