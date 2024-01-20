package Assign;

abstract class Shape{
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	
}

class Circle extends Shape{
	
	public void calculateArea() {
		
		int r;
		r = 10;
		
		double A;
		A = 3.14 * r * r; 
		
		System.out.println("The area of circle is: " + A);
	}

	@Override
	public void calculatePerimeter() {
		int r1,CP;
		
		r1 = 12;
		
		CP = (int) (2 * 3.14 * r1);
		
		System.out.println("THe perimeter of circle is: " + CP);
		
	}
	
}

class Triangle extends Shape{
	
	@Override
	public void calculateArea() {
		int b,h,TA;
		b = 10;
		h = 20;
		TA = ((b * h)/2);
		System.out.println("The area of triangle is: " + TA);
		
	}
	
	public void calculatePerimeter() {
		int a,b,c,P;
		a = 5;
		b = 9;
		c = 2;
		P = a + b + c;
		System.out.println("The perimeter of Triangle: " + P);
	}

	
	
}

public class Abstract2 {

	public static void main(String[] args) {
		Circle C = new Circle();
		C.calculateArea();
		C.calculatePerimeter();
		
		Triangle T = new Triangle();		
		T.calculateArea();
		T.calculatePerimeter();

	}

}
