package com.cmn_cls;

public class StringDemo {

	public static void main(String[] args)
	{
		String s2="This is Tops Technologies...";
		//String s1=new String("This is Tops Technologies...");
		
		System.out.println("String value is: "+s2);
		System.out.println("String size is: "+s2.length());
		
		System.out.println("lower case: "+s2.toLowerCase());
		System.out.println("upper case: "+s2.toUpperCase());
		
		System.out.println("substring: "+s2.substring(2));
		System.out.println("substring: "+s2.subSequence(2,5));
		
		System.out.println("substring: "+s2.charAt(0));
		
		if(s2.equals("This is Tops Technologies"))
		{
			System.out.println("both string are same");
		}
		else
		{
			System.out.println("both string are diff");
		}
		
		System.out.println("--------------------------");
		
		
		if(s2.equalsIgnoreCase("this is Tops Technologies"))
		{
			System.out.println("both string are same");
		}
		else
		{
			System.out.println("both string are diff");
		}
		System.out.println("String value is:"+s2);
		System.out.println("String value is:"+s2.length());
	}

}
