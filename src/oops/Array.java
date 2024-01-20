package oops;

import java.util.Arrays;
import java.util.Scanner;

public class Array 
{
	public static void main(String[] args)
	{
		int[] marks;
		int[] a= new int[5];
		System.out.println("This is a single dimensional/1D array.");
		
		for (int i = 0; i < a.length; i++)
		{
			a[i]=i + 1;
			System.out.println("a[" + i + "] = " + a[i]);
			
		}
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("TAKE THE VALUE FROM USER...");
		
		int[] mark;
		int[] b= new int[5];
		
		System.out.println("This is a single dimensional/1D array.");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < b.length; i++)
		{
			System.out.println("Enter a value: ");
			b[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
		System.out.println("-------------------------------------------------------------------");
		Arrays.sort(a);
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
	}


	
}
