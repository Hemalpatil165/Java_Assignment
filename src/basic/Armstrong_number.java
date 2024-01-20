package basic;

public class Armstrong_number {

	public static void main(String[] args) {
		
		int no = 153;
		int num = no;
		int sum = 0;
		int rem,cube;
		
		while(num != 0) {
			rem = num % 10;
			num = num / 10;
			
			cube = rem * rem * rem;
			
			sum = sum + cube;
			
		}
		
		if(sum == no) {
			System.out.println("This is an Armstrong number");
		}else {
			System.out.println("This is not an Armstrong number");
		}

	}

}
