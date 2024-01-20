package oops;

final class FDemo
{
	final long ph=956878568l;
	String name;
	
	public void setData() {
		name="Hemal";
	}
	public final void show() 
	{
		System.out.println("ph is: "+ph);
		System.out.println("name is: "+name);
	}
}
public class keywordFinal
{
	public static void main(String[] args)
	{
	FDemo f1=new FDemo();
	f1.setData();
	f1.show();
	}

}
