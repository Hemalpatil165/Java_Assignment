package demo;
public class EmpInfo
{
	public static void main(String[]args) 
	{
		Emp e1=new Emp();
		e1.empName="Hemal";
		e1.empID=101;
		e1.empCEOName="abc";
		//Emp.empCEOName="abc";
		
		

		Emp e2=new Emp();
		e2.empName="Nitu";
		e2.empID=102;
		e2.empCEOName="abc";
		//Emp.empCEOName="abc";
		
		e1.empinfo();
		e2.empinfo();
		

		
		
	}

}
