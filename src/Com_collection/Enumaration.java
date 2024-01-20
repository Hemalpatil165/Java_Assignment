package Com_collection;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class Enumaration 
{

	public static void main(String[] args) {
		
	
	Vector v1=new Vector(3,1);
	
	System.out.println("Default value is : "+v1);
	System.out.println("Default size is : "+v1.size());
	System.out.println("Default size is : "+v1.capacity());
	
	v1.add(100);
	v1.add(12.5f);
	v1.add("tanvi");
	v1.add('T');
	v1.add(12.5f);
	v1.add("tanvi");
	v1.add('T');
			
	System.out.println("Default value is : "+v1);
	System.out.println("Default size is : "+v1.size());
	System.out.println("Default size is : "+v1.capacity());
	
	v1.remove(3);
	System.out.println("Default value is : "+v1);
	System.out.println("Default size is : "+v1.size());
	System.out.println("Default size is : "+v1.capacity());
	System.out.println();
	
	
//	Iterator i1=h1.iterator(); 
//	while (i1.hasNext()) {
//		System.out.println(i1.next());  
//	}

		Enumeration e1=v1.elements();
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
			
		}
	}

}



