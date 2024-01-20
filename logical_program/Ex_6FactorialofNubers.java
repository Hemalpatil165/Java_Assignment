package logical_program;

public class Ex_6FactorialofNubers
{
	public static void main(String[] args)
	{
		int num=4;  //4*3*2*1
		int fact=1;  //24
		
		for(int i=num; i>=1; i--)
		{
			fact=fact*i;	 //24*1=24
		}
		System.out.println(fact);
	}

}
