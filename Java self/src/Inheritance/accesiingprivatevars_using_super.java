package Inheritance;
class Box
{
    private double width,height,depth;
    
    Box(Box ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    Box(double w ,double h ,double d )
    {
        width=w;
        height=h;
        depth=d;
    }
    Box()
    {
        width=height=depth=-1;
        
    }
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
    
    //constructor clone of an object
    Boxweight(Boxweight ob)
    {
        super(ob);
        weight=ob.weight;
    }
    
    //constructor clone when all parameters are specified
    Boxweight(double w,double h,double d,double m)
    {
        super(w,h,d);
        weight=m;
    }
    
    //default constructor
    Boxweight()
    {
        super();
        weight=-1;
    }
    
    //constructor when cube is created
    Boxweight(double len,double m)
    {
        super(len);
        weight=m;
    }
}

public class accesiingprivatevars_using_super
{
    public static void main(String[] args) 
    {
        Boxweight mb1=new Boxweight(10,20,15,34.3);
        Boxweight mb2=new Boxweight(2,3,4,0.076);
        Boxweight mb3=new Boxweight();
        Boxweight mb4=new Boxweight(3,2);
        Boxweight mb5=new Boxweight(mb1);
        double vol;
        
        vol=mb1.volume();
        System.out.println("volume of box 1 is:" +vol);
        System.out.println("weight of box 1 is" +mb1.weight );
        System.out.println();
        
        vol=mb2.volume();
        System.out.println("volume of box 1 is:" +vol);
        System.out.println("weight of box 1 is" +mb2.weight );
        System.out.println();
        
        vol=mb3.volume();
        System.out.println("volume of box 1 is:" +vol);
        System.out.println("weight of box 1 is" +mb3.weight );
        System.out.println();
        
        vol=mb4.volume();
        System.out.println("volume of box 1 is:" +vol);
        System.out.println("weight of box 1 is" +mb4.weight );
        System.out.println();
        
        vol=mb5.volume();
        System.out.println("volume of box 1 is:" +vol);
        System.out.println("weight of box 1 is" +mb5.weight );
        System.out.println();
        
        
        
        
        
        
    }
    
}
