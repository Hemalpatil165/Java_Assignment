package oops;

public class ClassDemo
{
	class student 
	 {
		 int roll_no;//stack
		 String name;
		 
		 public void setData()
		 {
			 roll_no=1;
			 name="Hemal";
			 
		 }
		 public void show()
		 {
			 System.out.println("Roll No is "+roll_no);
			 System.out.println("Name is "+name);
		 }
	 }
		 public  class demo
		 {
			 public void main(String[] args)
			 {
				 //[class_name][object_name]=new [class_name]
				 student s1=new student();//heap
				 s1.setData();//student s1 has a set a data of the studet s1.set data
				 s1.show();
			 }
		 }

}


