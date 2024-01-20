package demo;
public class local_samp2
{
	// static global variable
	static int a=10;
	
	public static void main(String[]args)
	{
		
		System.out.println(a);
		System.out.println("--------");
		
		// static global variable call from diff class

		System.out.println(local_samp3.b);
	
	}
	  public static void m1() 
	  {
		  System.out.println(a);
	  }
	  
	  public static void m2() 
	  {
		  System.out.println(a);
	  }
	
	

}
