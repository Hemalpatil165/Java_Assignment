package oops;
class A{
	public void show() {
		System.out.println("In Class A");
	}
}

class B extends A{
	public void show() {
		super.show(); 		//super is a keyword to overcome the problem with no new object needs to create
							//	for run the code of parent class
		System.out.println("In Class B");
	}
	
}
class C extends B{
	public void show() {
		super.show(); 		//super is a keyword to overcome the problem with no new object needs to create
							//		for run the code of parent class
		System.out.println("In Class C");
	}
	
}
public class PolyOverRiding {

	public static void main(String[] args) {
		C c = new C();
		c.show();

	}

}
