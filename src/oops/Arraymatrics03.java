package oops;

import java.util.Scanner;

public class Arraymatrics03 {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("For matrix A.....");
		for (int i = 0; i < a.length; i++) 
		 {			 
			 for (int j = 0; j < a.length; j++) {
				 System.out.print("enter the value: ");
				 a[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("For matrix B.....");
		for (int i = 0; i < a.length; i++) 
		 {			 
			 for (int j = 0; j < a.length; j++) {
				 System.out.print("enter the value: ");
				 b[i][j] = sc.nextInt();
				
			}
			
		} 
		 
		 
		System.out.println("Sum of Matrix.........");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
			
		}
		
		 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
	}

}
