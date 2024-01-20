package ComException;

class second implements Runnable{
//Runnable demo using the try catch...
public void run(){
	for (int i = 1; i <=5; i++) 
	{
		System.out.println("In Tdemo Thrad " + i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}	
	 }
   }	
}
public class Runnabledemo 
{
	public static void main(String[] args) 
	{
		second s1=new second();
		Thread t1=new Thread(s1);
		t1.start();
		t1.setName("Nitu");
		t1.setPriority(Thread.MAX_PRIORITY);
		for (int i = 1; i <=5; i++)
		{
			System.out.println("In main Thread " + i);
			
			try {
				Thread.sleep(2000);
			   } 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}		
}
