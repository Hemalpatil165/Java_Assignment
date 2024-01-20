package oops;

class Complietime{
	
	// compile time know as fun overloading
	int a,b;
   
 public void sum()
 {
	 a=10;
	 b=20;
	 System.out.println("Sum is: "+(a+b));
 }
  public void sum(int num1,int num2,int num3)
  {
	  a=num1;
	  b=num2;
	  System.out.println("sum is: "+(a+b+num3));
  }
	public int sum(int num1,int num2)
	{
		return num1+num2;	
	}

}


public class polydemo
{
	public static void main(String[] args)
	{
		Complietime ctp=new Complietime();
		ctp.sum();
		ctp.sum(1, 2, 1);
		System.out.println("sum is:"+ctp.sum(10,20));
	}
}
