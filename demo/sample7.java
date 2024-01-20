package demo;

public class sample7{
	//5. example of method without/zero parameter
	
		public static void main(String[]args)
		{
			//1.  static method call from same class
			m1();                //methodname();
			
			//2.  static method call from diff class
			sample8.m2();        //classname.methodname();	
			
			
			//3. non-static method call from same class
			sample7 s7=new sample7();      //1. create object of same class
			s7.m3();                       //2. method call
			
			//4. non-static method call from diff class
			sample8 s8=new sample8();       //1. create object of diff class
			s8.m4();                         //2. method call		
		}
		
		
		//static --> regular method 
		public static void m1()           //method without/zero parameter
		{
			System.out.println("running static method m1 from same class");
		}
		
		//non-static --> regular method 
		public void m3()              //method without/zero parameter
		{
			System.out.println("running non-static method m3 from same class");
		}
		
		
	
}
