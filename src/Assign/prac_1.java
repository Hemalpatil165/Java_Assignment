package Assign;

public class prac_1 {

	public static void main(String[] args)
	{
		int[] array1 = {5, 1, 4};
        int[] array2 = {1, 5, 3};
        
        int[] sumArray = new int[array1.length];  
        
        for (int i = 0; i < array1.length; i++)
        {  
            sumArray[i] = array1[i] + array2[i];  
        }    
        
        System.out.print("Sum Array: ");  
        
        for (int num : sumArray) {  
            System.out.print(num + " ");  
        }  
    }  
}  
	


