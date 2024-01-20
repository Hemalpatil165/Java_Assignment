package oops;

class Box{
	double length,width,height;
	
	public Box()
	{
		System.out.println("Defualt constuctor called...");
		length=1;
		width=2;	
		height=3;
	}
	
	public Box(double l,double w,double h )
	{
		System.out.println("paramiterized constuctor called...");
		length=l;
		width=w;	
		height=h;
	}
	
	public Box(Box b) {
		System.out.println("Copy constuctor called...");
		length=b.length;
		width=b.width;	
		height=b.height;
		
	}	
	
	public void volOfBox( )
	{
		System.out.println("Vol of box:"+(length*width*height));		
	}
}

public class Constructor {

	public static void main(String[] args)
	{
	Box dc=new Box();
	dc.volOfBox();
	
	Box pc=new Box(10,20,30);
	pc.volOfBox();
	
	Box cc=new Box(dc);
	cc.volOfBox();		

	}

}
