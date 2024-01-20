package logical_program;

public class Ex_12_Imp_Revesenum_without_StringFunction 
{
	
		public static void main(String[] args) {
		
			int num = 123;  
			int revNum = 0;     //321
			
				//  123            0>0        123/10=12/10=1/10=0
			for(int i=num;  i>0;       i= i/10) 
			{
				int rem = i % 10;  //   1 % 10 = 1
				revNum = revNum * 10 + rem;      //320+ 1= 321
			}
				
			System.out.println(revNum);
			
		}
}

	
		
			
			
			
			

			
			
			
			
			
			
			
			
			
			
//			while (num > 0)
//			{
//				int rem = num % 10;     
//				
//				revNum = revNum * 10 + rem;    
//				
//				num = num / 10;     
//			}
			
	
