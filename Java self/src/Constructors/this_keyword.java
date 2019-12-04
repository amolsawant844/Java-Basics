package Constructors;
public class this_keyword
{
    int age ;
    String name;
    int height,weight;
    this_keyword(int age,String name,int height,int weight)
    {
        this.age=age;
        this.name=name;
        this.height=height;
        this.weight=weight;
        System.out.println(weight);
        System.out.println(age);
        System.out.println(height);
        System.out.println(name);
    }
    public static void main(String[] args) {
        this_keyword t=new this_keyword(19,"amol",178,65);
    }
    
}
