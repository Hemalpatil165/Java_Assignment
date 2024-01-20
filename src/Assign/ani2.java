package Assign;
 

	
	class Animal {
	    
	    public void move() {
	        System.out.println("Moving like an animal");
	    }
	}

	
	class Cheetah extends Animal {
	    
	    public void move() {
	        System.out.println("Running like a cheetah");
	    }
	}


public class ani2
{
	public static void main(String[] args) {
	        
	        Cheetah myCheetah = new Cheetah();
	        myCheetah.move();
	    }
	}


