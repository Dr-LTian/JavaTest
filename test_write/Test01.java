package test_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test01 {
	public static void main(String[] args) {
		createFile();
	}
	
	
	public static void createFile(){
		OutputStream  out = null;
		try {
//			out =new FileOutputStream("test.txt");
			out = new FileOutputStream("test.txt", true);//out = new FileOutputStream(File Name, Boolean append);
			
			out.write(65);
			out.write(85);
			out.write(97);
			byte[] b = {10,65,85,71,48,49,50,10,52,53,54};
//			out.write(b);
			
			out.write(b, 0, b.length-3);
			
			String str = "ÄãºÃ£¬Ñý¹Ö";
			out.write(str.getBytes());
			
			
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {			
			try {
				
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
