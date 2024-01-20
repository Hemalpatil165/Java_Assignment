package Com_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		System.out.println("Default value is : "+a1);
		System.out.println("Default size is : "+a1.size());
		
		a1.add(100);
		a1.add(22.5f);
		a1.add('H');
		a1.add("Hemal");
		a1.add(new Integer(10));
		
		System.out.println("now value is : "+a1);
		System.out.println("now Default size is : "+a1.size());
		
		//a1.remove(1);
		System.out.println("now value is : "+a1);
		System.out.println("now Default size is : "+a1.size());
		
		a1.remove(new Integer(100));
	
		System.out.println("now value is : "+a1);
		System.out.println("now Default size is : "+a1.size());
		
		a1.add("nitu");
		System.out.println("now value is : "+a1);
		System.out.println("now Default size is : "+a1.size());
		
		//iterator is interface which we used to display value in list type
		Iterator i1=a1.iterator(); 
		while (i1.hasNext()) {
			System.out.println(i1.next());  
			
		}
	}
}
 