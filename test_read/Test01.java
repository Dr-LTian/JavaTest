package test_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) {
		InputStream();
	}
	
	public static void InputStream(){
		FileInputStream in=null;
		try {
			in = new FileInputStream("Hello.txt");
			
//			int a = in.read();
//			System.out.println(a);
//			while(a!=-1){
//				a = in.read();
//				System.out.println((char)a);
//				
//			}
			
			byte[] b1 = new byte[128];
			String str = null;
			while((in.read(b1))!=-1) {
				System.out.println("第2种------------------");
				str = new String(b1);
				System.out.println(str);
			}
			
			byte[] b = new byte[128];
			int l= 0;
			
			while((l=in.read(b, 0, b.length))!=-1){
				System.out.println("第3种------------------");
				System.out.println(new String(b, 0, l));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
