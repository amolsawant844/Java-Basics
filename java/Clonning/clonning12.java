package Clonning;

public class clonning12
{
	public static void main(String[] args)
            throws CloneNotSupportedException
    {
        clonning11 a=new clonning11(20,"hi");
        clonning11 b=(clonning11)a.clone();
        System.out.println(b.i);
        System.out.println(b.s);
        
    }

}
