package Assign;

public class prac_5 {

	public static void main(String[] args) 
	{
		System.out.println("To find a duplicate array value...");
		int[] duparray = {2, 3, 4, 4, 5};
		
		for (int i = 0; i < duparray.length - 1; i++) {
			
				if (duparray[i] == duparray[i + 1]) {
					System.out.println("This is a duplicate value");
					System.out.println(duparray[i]);
				}
			
			
		}
		
		
	
		
	}

}
