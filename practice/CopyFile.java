package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	public static void main(String[] args) {
		copy();
	}
	public static void copy(){
		InputStream in = null;
		OutputStream out = null;
		
		String str = null;
		try {
			in = new FileInputStream("test.txt");
			out = new FileOutputStream("qnm.txt",true);
			byte[] b = new byte[128];
			try {
				while(in.read(b)!=-1){
					str = new String(b);
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				out.write(str.getBytes());
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
