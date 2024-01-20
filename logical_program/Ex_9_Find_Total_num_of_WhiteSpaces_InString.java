package logical_program;

public class Ex_9_Find_Total_num_of_WhiteSpaces_InString 
{
	public static void main(String[] args)
	{
		String str = "a b  c d";
		int count = 0;  

		//              //2<=
		for (int i = 0; i <= str.length()-1; i++)
		{   
			//                  2
			char s1 = str.charAt(i);   //b
			
			//  b == ' '
			if (s1 == ' ')    // 
			{
				count++;     //1
			}
		}

		System.out.println("no of spaces in given string: " + count);
		
	}
}
		
		//System.out.println(str.replace(" ", ""));
		
	
	
