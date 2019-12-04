package Strings;

public class Stringfun
{
	public static void main(String[] args)
    {
        char a[]={'a','b','v','d','f','g','h'};
        String s1="hello";
        String s2="world";
        String s4="HelLo";
        
        char c=s1.charAt(0);
         System.out.println(c);
        int k=s1.length();
         System.out.println(k);
        String s3=s1.concat(s2);
         System.out.println(s3);
        boolean f=s1.equals(s2);
         System.out.println(f);
        boolean f1=s1.equalsIgnoreCase(s4);
         System.out.println(f1);
        int r=s1.compareTo(s2);
         System.out.println(r);
        int r1=s1.compareToIgnoreCase(s4);
         System.out.println(r1);
        boolean f2=s1.endsWith(s4);
        System.out.println(f2);
        int g=s1.hashCode();
        System.out.println(g);
        int  k1=s1.indexOf('x');
        System.out.println(k1);
        String e=s1.intern();
        System.out.println(e);
        String s6="HellO";
        String s7="HellO";
        int k4=s6.hashCode();
        int k5=s7.hashCode();
        System.out.println(k4);
        System.out.println(k5);
        String s8=new String("hi");
        String s9=new String("hi");
        int k6=s8.hashCode();
         int k7=s9.hashCode();
         System.out.println(k6);
          System.out.println(k7);
          String s10=s1.replace('h','l');
          System.out.println(s10);
        
        
    }


}
