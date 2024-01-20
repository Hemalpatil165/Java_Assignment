package practice;

class Tdemo
{
	int roll_no;
	String name;
	
	public void SetData(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
	public void show()
	{
		System.out.println("Roll no is: "+roll_no);
		System.out.println("Name is:"+name);
	}
}
public class prac_thiskeyword {
	public static void main(String[] args) {
	Tdemo td=new Tdemo();
	td.SetData(1,"Hemal");
	td.show();
	}
}
