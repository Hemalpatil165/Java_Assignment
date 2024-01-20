package logical_program;

public class Ex_13_ReverseEachWordInStatement22
{
	public static void main(String[] args) 
	{
		String s1="my name is abc";    //ym eman  si cba
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		for(int i=0; i<=ar.length-1; i++)      //
		{				
			String org = ar[i];  //  abc
			String rev = reverseString(org);
			System.out.print(rev+" ");   //ym  eman si  cba
		}		
	}
	
	public static String reverseString(String inp)
	{
		String rev="";
		for(int i=inp.length()-1; i>=0; i--)
		{
			rev=rev+inp.charAt(i);
		}
		return rev;
	}

}