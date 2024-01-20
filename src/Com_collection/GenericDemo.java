package Com_collection;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		//a1.add(12.64f);
		a1.add(new Integer(10));
		
		System.out.println("size is: "+a1.size());
		System.out.println("value is: "+a1);
		
	}

}
