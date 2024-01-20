package demo;
public class local_global1
{
	//example of local& global variable
	
	int c=50;  //global variable
	
	public void m1()
	{
		int a=10; // local variable
		System.out.println(a);
		System.out.println(c);
	}
	
	public void m2()
	{
		int b=10;  //local variable
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		local_global1 s1=new local_global1();
		s1.m1();
		s1.m2();
	}
}
