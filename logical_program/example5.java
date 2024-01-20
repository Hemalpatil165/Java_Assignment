package logical_program;

import java.util.Scanner;

public class example5 
{
	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
		int x,y,sum=0;
		
		System.out.println(" first num1: ");
		
		 x=sc.nextInt();
		
		System.out.println("second num2: ");
		
		 y=sc.nextInt();
		
	
		for(int i=1; i<=x; i++)
		{
			sum=x+y;
		}
		System.out.println("Sum of 2 Number is:"+sum);
		
		sc.close();			
	}
}
