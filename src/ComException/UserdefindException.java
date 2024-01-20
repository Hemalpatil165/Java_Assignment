package ComException;

import java.util.Scanner;

//This is a user-defined exception
class TanviException extends Exception{
	double amount;
	//constructor
	public TanviException(double amount) {
		this.amount = amount;
	}
}

//we've made two operations : Deposite & Withdraw
class ATM{
	double amount,balance;
	
	//this method is corelated with deposit
	
	public void deposit(double amount) {
		this.amount = amount;
		
		balance = balance + amount;
		System.out.println("Your current balance is: " + balance);				
	}
	
	//this method is corelated with withdraw
	
	public void withdraw(double amount) throws TanviException {
		
		if(amount <= balance) {
			
			this.amount = amount;
			
			balance = balance - amount;
			System.out.println("Your Remaining balance is: " + balance);
		}
		else
		{
		
		double needs;
		
		needs = amount - balance;
		
		throw new TanviException(needs);	//throw new constructorname		
		}
}
}
public class UserdefindException {

	public static void main(String[] args) {
		
		double amount;
		Scanner sc = new Scanner(System.in);
		
		//THIS IS FOR DEPOSITE
		System.out.println("Enter the amount to be deposited: ");
		amount = sc.nextDouble();
		
		ATM atm = new ATM();
		atm.deposit(amount);
		
		//THIS IS FOR WITHDRAW
		System.out.println("Enter the amount to be withdrawed: ");
		amount = sc.nextDouble();
		
		try {
			atm.withdraw(amount);//try catch is the handdling the user exception handling
		}
		catch (TanviException e){
			System.out.println("If you deposite " + e.amount + " rs" + " more you can withdraw " + amount + " rs");
		}
	
	}
}

