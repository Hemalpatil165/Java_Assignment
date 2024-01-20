package basic;

public class Prc_22prime 
{
public static void main(String[] args)
{
	
	int no=10;
	int flag=1;

	for(int i=2; i<5; i++)
	
		if (no % i == 0)
		{
			flag=0;
		}
		
		if(flag==0)
		{
			System.out.println("not prime num");
		}
		else
		{
			System.out.println("given number is a prime number");
	}
	
}
}

