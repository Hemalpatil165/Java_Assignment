package oops;
  class Result{
	  String grade="A+";
  }



class Demo3 extends Result implements Inter_1
{
	public void show()
	{
		System.out.println("i no: "+i_no);
		System.out.println("i 2: "+i2);
		System.out.println("grade: "+grade);
	}
}
  
public class Demo2 extends Demo3 
{
public class InterfaceDemo{
	
}
public static void main(String[] args) {
		Demo3 d1=new Demo3();
		d1.show();

	}

}
