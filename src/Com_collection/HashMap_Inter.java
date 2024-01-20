package Com_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Inter {

	public static void main(String[] args)
	{
		HashMap h1=new HashMap();
		System.out.println("Default value is : "+h1);
		System.out.println("Default size is : "+h1.size());
		
		h1.put(1, "hemnit");
		h1.put("nitu", "Patil");
		h1.put("Hemal", 1111);
		h1.put(2, "tanvi");
		h1.put(1, "paro");
		
		System.out.println("now value is : "+h1);
		System.out.println("now Default size is : "+h1.size());
		
		h1.remove("charmi");
		System.out.println("now value is : "+h1);
		System.out.println("now Default size is : "+h1.size());
		
		Set set=h1.entrySet();
		
		Iterator i1=set.iterator();
		
		while (i1.hasNext()) {
			//will key value togrther
//			System.out.println(i1.next());
//			
			//to print key and value in seprate lines
//			Map.Entry me=(Map.Entry)i1.next();
			
//			System.out.println("key is :"+me.getKey());
//			System.out.println("value is :"+me.getValue());
			
			String s1=i1.next().toString();
			
			String[] ss=s1.split("=");
			
			System.out.println("key is:"+ss[0]);
			System.out.println("value is:"+ss[1]);
			}
		
	}

}
