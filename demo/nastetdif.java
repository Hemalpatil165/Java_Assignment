package demo;
public class nastetdif
{
	public static void main(String[] args)
	{
		int marks=88;
		
		if(marks>65) 
		{
			System.out.println("DISTINCTION");
		}
		else if(marks>=60 & marks<=64) 
		{
			System.out.println("1ST CLASS");
		}
		else if(marks>=50 & marks<=59) 
		{
			System.out.println("2ST CLASS");
		}
		else if(marks>=35 & marks<=49) 
		{
			System.out.println("PASS");
		}
		else if(marks<35) 
		{
			System.out.println("FAIL");
		}

		
		
	}

}
