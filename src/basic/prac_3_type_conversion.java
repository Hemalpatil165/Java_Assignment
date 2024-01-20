package basic;

public class prac_3_type_conversion 
{
public static void main(String[] args)
{
	int i1=10;
	long l1=2147483648l;
	
	System.out.println("long is :"+l1);
	
	int i2=(int)l1;
	System.out.println("int value is:="+i2);
	
	int i4=256;
	byte b1=(byte)i4;
	
	System.out.println("byte is:"+b1);
	
}
}
