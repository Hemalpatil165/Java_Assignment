package oops;

import java.util.Scanner;

public class jaggedarray {

	public static void main(String[] args) {
		/*System.out.println("static........");
		int [][] a = new int[3][];
		
		//no of col in each row
			a[0] = new int[3];
			a[1] = new int[4];
			a[2] = new int[2];
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = j + 1;
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
			*/
		
			System.out.println("dynamic........");
			Scanner sc = new Scanner(System.in);
			
			int row;
			
			System.out.println("enter of rows: ");
			row = sc.nextInt();
			
			int[][] a = new int[row][];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Enter number of column in row no" + i + " :");
				a[i] = new int[sc.nextInt()];				
			}
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.println("enter value: ");
					a[i][j] = sc.nextInt();					
				}
			}
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(" " + a[i][j]);					
				}
				System.out.println();
			}
	}

}
