package logical_program;

public class Ex_13_printStatementInReverseOrder4
{
	public static void main(String[] args) 
	{
		
		String s1="my name is abc";    //cba si eman ym
				
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		System.out.println("------------");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}