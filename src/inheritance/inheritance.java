package inheritance;

class student1{
	int id;
	String name;
	
	public void setdata() {
		id = 1;
		name = "Hemal";
	}
}

class Sports extends student1{
	int sports_marks =52;
	
	
}

class Grade extends Sports{
	String grade = "A+";
	
	public void show() {
		System.out.println("id is: " + id);
		System.out.println("name is: " + name);
		System.out.println("Sports marks: " + sports_marks);
		System.out.println("grade is: " + grade);
	}
	}


public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Sports sp = new Sports();
//		sp.setdata();
//		sp.show();
		
		Grade gd = new Grade();
		gd.setdata();
		gd.show();

	}

}
