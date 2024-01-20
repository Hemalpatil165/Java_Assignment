package Assign;

class ani
{
	 void makesound()
	 {
		 System.out.println("animal sound");
	 }
}

class cat extends ani
{
	void makesound()
	{
		System.out.println("cat make a sound mew mew");
	}
}

public class Animal2 {

	public static void main(String[] args) {
		
		cat c=new cat();
		c.makesound();
	}
	}


