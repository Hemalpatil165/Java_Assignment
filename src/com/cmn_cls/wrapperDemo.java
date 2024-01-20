package com.cmn_cls;
public class wrapperDemo {
	public static void main(String[] args)
	{
		Integer i1=new Integer(120);
		System.out.println("Auto boxing is :"+i1);
		
		int i2=123;
		Integer i3=i2;
		System.out.println("Boxing is : " + i3);
		
		int i4=i1;  //int i4=i1.intValue();
		System.out.println("Un boxing is: "+i4);

		//coversion string to int
		String s1="222";
		String s2="111";
		
		int i5=Integer.parseInt(s1);
		int i6=Integer.parseInt(s2);
		System.out.println(i5+i6);
		
		//conversion int to string
		String s3=String.valueOf(i5);
		System.out.println("String is : " + s3);
	}
}
