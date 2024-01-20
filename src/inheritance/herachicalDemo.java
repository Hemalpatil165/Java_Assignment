package inheritance;

class parent
{
	String p_name;
	long ph_no;
	
	public void setParent()
	{
		p_name="Salim khan";
		ph_no=66666666l;
	}
}

class child1 extends parent
 {
	 String c_name="Salman";
	 public void show()
	 {
		 System.out.println("for any compint of "+c_name+" "+p_name+" "+"call"+ph_no);
	 }
	 
}
 
 class child2 extends parent
 {
	 String c_name="Arbaz";
	 public void show()
	 {
		 System.out.println("for any compint of "+c_name+" "+p_name+" "+"call"+ph_no);
	 }
 }




public class herachicalDemo {

	public static void main(String[] args) 
	{
		child1 c1=new child1();
		child2 c2=new child2();
		
		c1.setParent();
		c1.show();
		
		c2.setParent();
		c2.show();
	}

}
