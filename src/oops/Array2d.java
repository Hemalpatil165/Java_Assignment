package oops;

import java.util.Scanner;

public class Array2d 
{
	public static void main(String[] args) 
	{
		int[][] a=new int[3][3];  
		
		Scanner sc=new Scanner(System.in);
		
		 for (int i = 0; i < a.length; i++) 
		 {
			 
			 for (int j = 0; j < a.length; j++) {
				 System.out.print("enter the value: ");
				a[i][j] = sc.nextInt();
				
			}
			
		}
		 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
