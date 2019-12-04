package Clonning;

public class clonning11 implements Cloneable
{
	int i;
    String s;
  clonning11 (int i,String s) 
  {
      this.i=i;
      this.s=s;
  }
  @Override
  protected Object clone()
          throws CloneNotSupportedException
  {
      return super.clone();
  }


}
