package Inheritance;

public class Hierarchicalinheritance13 extends Hierarchicalinheritance11 
{
	public Hierarchicalinheritance13()
	{   
		System.out.println("Class BMW"); 
	} 
	public void engine()
	{   
		System.out.println("Engine: 4 stroke");   
	}
	public static void main(String[] args)
	{
		System.out.println("Subclass Maruti");
		Hierarchicalinheritance12 m=new Hierarchicalinheritance12();
		m.vehicleType(); 
		m.brand();
		m.speed();
		System.out.println("Subclass BMW");
		Hierarchicalinheritance13 b=new Hierarchicalinheritance13();   
		b.vehicleType();
		b.engine();
		}

}
