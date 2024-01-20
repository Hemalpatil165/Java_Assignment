package oops;
// constsnt AT memory side
//used with variable:opposite to final keyword

class SDemo{
	int no;
	static int s_no;


	public static void show(){
		System.out.println("in show");
		
		s_no=10;
		
		System.out.println("s no of show is "+s_no);
		
		int r_no=45;
		
		System.out.println("r no is :"+r_no);
	}
}	

public class Keywordstatic
{
	public static void main(String[] args)
	{
//		SDemo s1=new SDemo();
//		SDemo s2=new SDemo();
//		SDemo s3=new SDemo();
		
		SDemo.show();
//class name.method name();	//use for static
		
//		s1.no=1;
//		s2.no=2;
//		s3.no=3;
//		
//		System.out.println("no is:"+s1.no);
//		System.out.println("no is:"+s2.no);
//		System.out.println("no is:"+s3.no);
		
		SDemo.s_no=10;
		SDemo.s_no=20;
		SDemo.s_no=30;
		
		System.out.println("no is:"+SDemo.s_no);
		
		System.out.println("no is:"+SDemo.s_no);
		
		System.out.println("no is:"+SDemo.s_no);

	}
	
}				