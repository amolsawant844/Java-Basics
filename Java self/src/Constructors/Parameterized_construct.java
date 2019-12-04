package Constructors;
public class Parameterized_construct {
 Parameterized_construct(int a)
    {
        System.out.println("value of a:"+a);
        System.out.println("you are present in a constructor");
    }
    public static void main(String[] args) {
        Parameterized_construct b=new Parameterized_construct(4);
    }
       
}
