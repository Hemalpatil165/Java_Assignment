package basic;

public class prac_20_left 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++) {
			for(int k=i; k<5; k++) {
				System.out.print(" ");
			}
			
			for(int j = 1;j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	System.out.println("----------------------------");
	
	for(int m = 1; m <= 5; m++) {
		
		for(int o = m;o < 5;o++){
			System.out.print(" ");
		}
		
		for(int n = m ; n >= 1; n--) {
			System.out.print("*"+"*");
		}
		System.out.println();
	}
System.out.println("-------------------------------");
		
	
	for(int p = 5; p>= 1; p--) {
		for(int r = p;r <=1;r++) {
			System.out.print(" ");
		}
		
		for(int q = p; q<=5; q++) {
			System.out.print(q);
		}
		System.out.println();		
	}
	System.out.println("-----------------------");
	
	for(int m = 1; m <= 3; m++) {
			
			for(int o = m;o <=3;o++){
				System.out.print(" ");
			}
			
			for(int n = m ; n <=m*2-1; n--) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	
	       
	
	
	
		
	}

}
