package practice;

public class Stringclass_0201 {

	public static void main(String[] args)
	{
		String s2="This is a Table";
		String s3="This is a Chair";
		String s4=" ";
		String s5="This is a Table";
		
		System.out.println("String value is: "+s2);
		System.out.println("String size is "+s2.length());
		System.out.println("-------------------------------");
		System.out.println("Lower case :"+s2.toLowerCase());
		System.out.println("Upper Case :"+s2.toUpperCase());
		
		System.out.println("substring :"+s2.substring(1));
		System.out.println("substring :"+s2.substring(3,6));
		
		System.out.println("substring :"+s2.charAt(6));
		System.out.println(s2.startsWith(s2));
		
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.concat(s3));
		
		System.out.println(s2.hashCode());
		System.out.println(s4.isBlank());
		System.out.println("-----------------------------");
		System.out.println(s2.contains(s5));
		System.out.println(s2.intern());
		
		//System.out.println(s2.replaceFirst(s3, s5));
		System.out.println(s3.stripTrailing());
		System.out.println(s2.format(null, s5, args));
		
		System.out.println(s3.trim());
		System.out.println(s2.compareToIgnoreCase(s4));
		
		System.out.println(s2.codePointCount(1,5));
		System.out.println(s2.equals(s3));
		
		System.out.println(s2.offsetByCodePoints(1,9));
		System.out.println(s2.intern());
		
		System.out.println("--------------------------------");
		
		System.out.println(s2.regionMatches(1, s5, 6, 4));
		System.out.println(s2.toLowerCase());
		
		System.out.println(s3.equalsIgnoreCase(s3));
		
		System.out.println("------------------------------");
				
		System.out.println(s2.intern());
		System.out.println(s2.getBytes());
		System.out.println(s2.indexOf(3));
	}
	

}
