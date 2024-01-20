package oops;

abstract class ADemo
{
	int roll_no;
	String name;
	
	public void setData()
	{
		roll_no=12;;
	   name="Hemal";
	}
	public abstract void show();	
}
 class Demo extends ADemo{
	 
  public void show()
  {
	  System.out.println("Roll no is "+roll_no);
	  System.out.println("name is "+name);
  }

 }
public class Abstraction {

	public static void main(String[] args)
	{
		Demo a1=new Demo();
		a1.setData();
		a1.show();

	}

}
