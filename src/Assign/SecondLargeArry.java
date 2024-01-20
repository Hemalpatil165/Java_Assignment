package Assign;

public class SecondLargeArry {

	public static void main(String[] args)
	{
		System.out.println("To find a second array value...");
		
		int[] sarray = {2, 5, 8, 7, 6};
		
		for (int i = 0; i < sarray.length - 1; i++) {
			
				if (sarray[i] > sarray[i + 1]) {
					
					System.out.println("Large " + sarray[i]);
				
				}
				


		}

	}
}