package logical_program;

public class Ex_8imp_Amstrong_Number
{
		public static void main(String[] args)
		{
			int OrgNum = 153;  // 1+8+8=17
			int sum = 0;    //153
			
					// 153      0>0     	 153/10 =15/10=1/10=0
			for (int i = OrgNum; i > 0;  i = i / 10)
			{
				int rem = i % 10;  // 1 % 10 = 1
				sum = sum+(rem * rem * rem);   //152 + 1 = 153
			}
			if (OrgNum == sum)  //
			{
				System.out.println("given number " + OrgNum + " is an armstrong number");
			} 
			else 
			{
				System.out.println("given number " + OrgNum + " is not an armstrong number");
			}
			
			
		}
		
	}
