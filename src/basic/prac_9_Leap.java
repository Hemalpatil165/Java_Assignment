package basic;

public class prac_9_Leap
{
	public static void main(String[] args) {
	
	int year=1900;
	
	if((year%4==0&&year%100!=0)||year%400==0)
	{
		System.out.println("Leap year");
		
	}
	else
	{
	
		System.out.println("not Leap year");
	}}
}


