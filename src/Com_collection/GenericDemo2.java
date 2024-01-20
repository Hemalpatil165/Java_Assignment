package Com_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo2 {

	public static void main(String[] args) 
	{
		//ArratList <user-defined class> object name = new ArrayList<>();
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		
		Student s1 = new Student();
		s1.setRoll_no(1);
		s1.setName("Hemal");
		s1.setBranch("Testing");
		s1.setCity("Surat");
		
		
		Student s2 = new Student();
		s2.setRoll_no(2);
		s2.setName("Dadhish");
		s2.setBranch("CS");
		s2.setCity("Surat");
		
		//To add data via object 
		a1.add(s1);
		a1.add(s2);
		
		//This will not show an output
			//System.out.println(a1);
		
		//That's why we use Iterator
		
		Iterator<Student> i1 = a1.iterator();
		
		while(i1.hasNext()) {
			//This will not show an output
				//System.out.println(i1.next());
			
			Student s = i1.next();
			
			System.out.println("roll no is: "+s.getRoll_no());
			System.out.println("name is: "+s.getName());
			System.out.println("branch is: "+s.getBranch());
			System.out.println("city is: "+s.getCity());
		}		
		
	}
}
