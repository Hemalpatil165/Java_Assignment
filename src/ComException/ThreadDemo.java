package ComException;

class TDemo extends Thread{

public void run(){
	for (int i = 1; i <=5; i++) 
	{
		System.out.println("In Tdemo Thrad " + i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			
			e.printStackTrace();
		}	
	}
}	
}
public class ThreadDemo {

	public static void main(String[] args) {
		TDemo td= new TDemo();
		td.start();
		
		for (int i = 1; i <=5; i++)
		{
			System.out.println("In main Thread " + i);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}		
}
