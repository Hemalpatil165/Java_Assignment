package ComFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamDemo {

	public static void main(String[] args)
	{
		try {
		//open and create the file
			
		FileOutputStream fos= new FileOutputStream("filehemal.txt",true);//to remove data over ridden(append) we use true
		String msg="\n This is a Tops";
				
		byte[] b1=msg.getBytes();
				
		//write into file
		fos.write(b1);
			    
		//to empty fos
		fos.flush();
			    
		//to close  file
		fos.close();
				
		System.out.println("data written");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			FileInputStream fis=new FileInputStream("filehemal.txt");
				int x;
				
				while((x=fis.read())!=-1) {
					System.out.print((char)x);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
	

}
