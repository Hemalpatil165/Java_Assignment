package Assign;

abstract class Creature{
	public abstract void sound();
}
class Lion extends Creature{
	public void sound() {
		System.out.println("Roar");
	}
}
class Tiger extends Creature{
	public void sound() {
		System.out.println("Growl");
	}
}

public class Abstract1 {

	public static void main(String[] args) {
		Lion L = new Lion();
		L.sound();
		
		Tiger T = new Tiger();
		T.sound();

	}
}
