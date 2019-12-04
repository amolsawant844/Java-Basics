
package Basics;


public class Breakstatement_as_a_form_of_goto
{
    public static void main(String[] args) {
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("before the break");
                    if(true) break second;
                    System.out.println("this wont execute");
                }
                System.out.println("this wont execute");
            }
            System.out.println("this is after second block");
        }
    }
    
}
