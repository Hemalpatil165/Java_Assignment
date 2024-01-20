package oops;

import java.util.Scanner;

public class Scannerdemo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
//		
//		int i,j;
//		
//		System.out.println("Enter i= ");
//		i=sc.nextInt();
//		
//		System.out.println("Enter j= ");
//		j=sc.nextInt();
//		
//		System.out.println("Sum is : "+(i+j));
//		
		
		char ch;
		System.out.println("Enter the value in charter: ");
		ch=sc.next().charAt(0);
		
		System.out.println("char enter is: "+ch);
		
		String name;
		//to clean buffer[THis is the first way]
		sc.nextLine();
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		
		System.out.println("name is : "+name);
	}

}
