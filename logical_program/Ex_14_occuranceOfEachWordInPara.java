package logical_program;
import java.util.HashMap;
import java.util.Set;

public class Ex_14_occuranceOfEachWordInPara 
{
	
	public static void main(String[] args) {
		
		String org="abc ab abcd abc ab abc";
		
		String[] ar = org.split(" ");
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String s1 = ar[i];
			
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
		}
		
		//get all keys
		Set<String> allKeys = mp.keySet();
		
//		//ocurance of each word
//		for(String key:allKeys)
//		{
//			System.out.println(key+": "+mp.get(key));
//		}
		
		//print only duplicate words in para
		for(String key:allKeys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+": "+mp.get(key));
			}
		}
		
	}

}