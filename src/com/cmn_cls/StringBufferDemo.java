package com.cmn_cls;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("This is Tops Technologies...");
		//String s1=new String("This is Tops Technologies...");
		
		System.out.println("String value is: "+s1);
		System.out.println("String size is: "+s1.length());
		
		s1.insert(0,"Hii");
		System.out.println("String value is: "+s1);
		System.out.println("String size is: "+s1.length());
		
		s1.append("Hemal");
		System.out.println("String value is: "+s1);
		System.out.println("String size is: "+s1.length());
		
		s1.delete(0, 4);
		System.out.println("String value is: "+s1);
		System.out.println("String size is: "+s1.length());
		
		s1.reverse();
		System.out.println("String value is: "+s1);
		System.out.println("String size is: "+s1.length());
	
	    

	}

}
