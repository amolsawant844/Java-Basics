package Innerclasses;

public class Memberinnerclass12 
{
	public static void main(String[] args) 
	{
		Memberinnerclass11 o=new Memberinnerclass11();
		o.test();
		Memberinnerclass11.Inner in=o.new Inner();//if you want to create object of inner class here 
		in.show();
	}

}
