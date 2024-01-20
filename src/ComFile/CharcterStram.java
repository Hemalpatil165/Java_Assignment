package ComFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharcterStram {

	public static void main(String[] args) {
		
		try {                                   
			FileWriter fw=new FileWriter("file2",true);//to remove data over ridden(append) we use true
			String msg="\nhemal has one laptop";
			
			fw.write(msg);
			
		    fw.flush();
		    
			fw.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader fr=new FileReader("file2");
			int x;
			while((x=fr.read())!=1) {
				System.out.print((char)x);//we want a character output that why we apply char to variable 'x'.
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
