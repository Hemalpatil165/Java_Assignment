package Com_collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	
		Vector v1=new Vector(3,1);
		
		System.out.println("Default value is : "+v1);
		System.out.println("Default size is : "+v1.size());
		System.out.println("Default size is : "+v1.capacity());
		
		v1.add(100);
		v1.add(12.5f);
		v1.add("Hemal");
		v1.add('T');
		v1.add(12.5f);
		v1.add("nitu");
		v1.add('T');
				
		System.out.println("Default value is : "+v1);
		System.out.println("Default size is : "+v1.size());
		System.out.println("Default size is : "+v1.capacity());
		
		v1.remove(3);
		System.out.println("Default value is : "+v1);
		System.out.println("Default size is : "+v1.size());
		System.out.println("Default size is : "+v1.capacity());
		System.out.println();
	}

}
