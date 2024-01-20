package logical_program;

import java.util.Scanner;

public class Ex_9_Find_Total_num_of_WhiteSpaces_InStringUsingScan
{
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		
		
		//String str = " a b   c d";
		int count = 0;        //1

		//                 //2<=
		for (int i = 0; i <= str.length() - 1; i++)
		{    //                               2
			char s1 = str.charAt(i);   //b
			// 
			if (s1 == ' ')    //b==' '
			{
				count++;     //1
			}
		}

		System.out.println("no of spaces in given string: " + count);

	}
}
