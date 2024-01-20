package basic;

public class prac_11_nested_if 
{
	public static void main(String[] args)
	{
		int a = 10, b = 120, c = 4;
		if(a>b) {
			if(a>c) {
				System.out.println("A is greater");
			}else {
				System.out.println("C is greater");
			}
		}else {
			if(b>c) {
				System.out.println("B is greater");
			}else {
				System.out.println("c is greater");
			}
		}
		
		
	}

}
