package ComException;

import java.util.Scanner;

public class Demo {
     
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		
	System.out.println("a val:");
	a=sc.nextInt();
	
	System.out.println("b val:");
	b=sc.nextInt();
	
	try
	{
	System.out.println("div is :"+a/b);
	}
	catch(Exception e)
	{
	  e.printStackTrace();

	}
       finally {
              System.out.println("hi");
              System.out.println("Hemal");
             }
	     }
      }