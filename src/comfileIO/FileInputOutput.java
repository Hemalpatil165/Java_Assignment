package comfileIO;

import java.io.File;
//File Input Output 
    class Fdemo{
	File file;
 
  public Fdemo()
  {
	 file=new File("file3");
	 try {
		file.createNewFile();
		
	} catch (Exception e) 
	 {
		e.printStackTrace();
	 }
	 display();
	}
 public void display()
 {
	 System.out.println("can read file: "+file.canRead());
	 System.out.println("can write file: "+file.canRead());
	 System.out.println("can execute file: "+file.canRead());
	 System.out.println(" file name is : "+file.canRead());
	 System.out.println(" file path is : "+file.canRead());
	 System.out.println(" file absolute is : "+file.canRead());
 } 
 }	
public class FileInputOutput {

	public static void main(String[] args) {
		new Fdemo();

	}

}
