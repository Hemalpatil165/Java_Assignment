package Assign;

public class prac_6 
{
	public static void main(String[] args)
	{
		int arr[] = { 21, 53, 99, 9, 67, 66, 2, 91 };
	      
	      int size = arr.length;
	     
	      System.out.println("Even numbers are:");
	      for(int i=0; i<size; i++){
	         if(arr[i]%2==0){
	         
	            System.out.print(arr[i]+" ");
	         }
	      }
	    
	      System.out.println();
	      System.out.println("Odd numbers are:");
	      
	      for(int i=0; i<size; i++){
	         if(arr[i]%2==1){
	         
	            System.out.print(arr[i]+" ");
	         }
	      }
	   }
	}
		
	