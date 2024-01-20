package practice;

public class prac_primenum 
{
	public static void main(String[]args)
	{
		int num=3;
		int count=0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("it is not armstrong num");
		}
		else
		{
			System.out.println("its a armstrong num");
		}
				
	}

}
