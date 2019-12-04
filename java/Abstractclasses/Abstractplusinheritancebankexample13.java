package Abstractclasses;

public class Abstractplusinheritancebankexample13 extends  Abstractplusinheritancebankexample11 
{
	   public void si() 
	    {
	        System.out.println("rate of interest is 13%");
	        int r=13;
	        int p=1000;
	        int years=12;
	        float sia=(r*p*years)/100;
	        System.out.println("ur simple interest is:"+sia);
	    }
	    public static void main(String[] args) {
	    	Abstractplusinheritancebankexample11 b=new Abstractplusinheritancebankexample13();
	        b.disp();
	        b.si();
	    }


}
