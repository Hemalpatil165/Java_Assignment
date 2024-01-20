package demo;

public class sample12 
{
	public static void main(String[] args)
	{		
		studentInfo("abc", 101, 'A', 75.5f);
		studentInfo("xyz", 102, 'B', 5.5f);		
	}
	
		
	public static void studentInfo(String sname, int sRollNum, char sGrade, float sPer)
	{
		System.out.println(sname +" "+sRollNum+" "+ sGrade+" "+sPer);
	}

}
