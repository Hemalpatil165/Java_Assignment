package Com_collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) 
	{
		HashSet h1 =new HashSet();
		
        //dupicate values not allowed in hashset
		
		System.out.println("Default value is : "+h1);
		System.out.println("Default size is : "+h1.size());
		
		h1.add(100);
		h1.add(22.5f);
		h1.add('H');
		h1.add("Hemal");
		h1.add(new Integer(10)); 
		
		System.out.println("now value is : "+h1);
		System.out.println("now Default size is : "+h1.size());
		
		//a1.remove(1);
		System.out.println("now value is : "+h1);
		System.out.println("now Default size is : "+h1.size());
		
		h1.remove(new Integer(100));
	
		System.out.println("now value is : "+h1);
		System.out.println("now Default size is : "+h1.size());
		
		h1.add("nitu");
		System.out.println("now value is : "+h1);
		System.out.println("now Default size is : "+h1.size());
		
		h1.add("Hemnit");
		System.out.println("now value is: "+h1);
		System.out.println("now value is: "+h1);
		 
		Iterator i1=h1.iterator(); 
		while (i1.hasNext()) {
			System.out.println(i1.next());  
		}
	}

}
