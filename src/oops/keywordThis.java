package oops;

class TDemo{
	
	int roll_no;
	String name;
	
	public void setData(int roll_no,String name) {
		this.roll_no=roll_no;
		this.name=name;
	}
	
	public void show() {
		System.out.println("Roll no is: "+roll_no);
		System.out.println("name is: "+name);
	}
}
public class keywordThis {

	public static void main(String[] args)
	{
		TDemo td=new TDemo();
		td.setData(1,"Hemal");
		td.show();
	}

}
