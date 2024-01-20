package logical_program;

import java.util.HashMap;

import java.util.Set;

public class Ex_14_Count_Reapeating_Char_In_String_Using_Hashmap 
{
	public static void main(String[] args) {

		String org = "abcaba";

		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
					             //5<=5
		for (int i = 0; i <= org.length() - 1; i++)     //0-5
		{					  //                 5   
			char s1 = org.charAt(i);   //a
			
			if (mp.containsKey(s1))  //a--> true
			{
				mp.put(s1, mp.get(s1) + 1);   //a,3
			} 
			else
			{
                 mp.put(s1, 1);   //c,1
			}
		}
		Set<Character> allKeys = mp.keySet(); //[a, b, c]
		
//		//print occurence of each char
//		for (Character key : allKeys) 
//		{	
//			System.out.println(key +": "+ mp.get(key));
//		}
		
			
		//print only duplicate char
		for (Character key : allKeys) 
		{
			if(mp.get(key)>1)
			{
				System.out.println(key +": "+ mp.get(key));
			}
		}
		
		//System.out.println("a: "+ mp.get('a'));
		
	}

}