package Inheritance;
class Box
{
    double width,height,depth;
    
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
    Boxweight(double w,double h,double d,double m)
    {
        width=w;
        height=h;
        depth=d;
        weight=m;
    }
}

public class Superclassvar_referencing_a_subclassobj 
{
    public static void main(String[] args)
    {
        Boxweight weightbox=new Boxweight(3,5,7,8.37);
        Box plainbox=new Box();
        double vol;
    
        vol=weightbox.volume();
        System.out.println("vol of weightbox is:"+vol);
        System.out.println("weight of weightbox is:" +weightbox.weight);
        System.out.println();
        
        //assign boxweight ref to box reference
        plainbox=weightbox;
        vol=plainbox.volume();
        System.out.println("volume of plain box :" +vol);
        
    }
}
