package basic;

public class prac_19_123 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1;j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		for(int m = 1; m <= 5; m++) {
			
			for(int n =m ; n>=1; n--) {
				System.out.print(n);
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
	
	for(int p = 5; p>= 1; p--) {
		
		for(int q = p; q<=5; q++) {
			System.out.print(q);
		}
		System.out.println();
	}
System.out.println("---------");
for(int r= 5; r>= 1; r--) {
		
		for(int s = 5; s>=r; s--) {
			System.out.print(s);
		}
		System.out.println();
	}
System.out.println("---------");
for(int t= 1; t <=5; t++) {
	
	for(int u = 1;u<=t; u++) {
		System.out.print(u%2);
	}
	System.out.println();
}

System.out.println("------------------");
	for (int v = 1; v<= 7; v++)
	{
	
	for (int w= 1; w<= v; w++)
	{
	  System.out.print (w*2);
	}
	System.out.println ();
	}

System.out.println("--------------");

	for(int x= 1; x<=5; x++) {
		
		for(int y=x; y<=5; y++) {	
			System.out.print(" ");
		}
	
		for(int z = 1;z<=x; z++) {
			System.out.print(z);
		}
		System.out.println();
	}

	}
}//