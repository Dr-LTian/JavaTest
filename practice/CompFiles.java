package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CompFiles {
	/**
	 * ʹ���ļ��������ֱ��ȡ�����ļ��е����ݣ��Ƚ϶�Ӧλ�õ��ֽڣ��ж������ļ��Ƿ���ȫ��ͬ��
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isSameFile());
	}
	
	public static boolean isSameFile(){
		boolean bl = false;
		InputStream in=null;
		String str = null;
		String str1 = null;
		try {
			in = new FileInputStream("Hello.txt");
			byte[] b = new byte[128];
			
			try {
				while(in.read(b)!=-1){
					str = new String(b);
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			in = new FileInputStream("test.txt");
			
			try {
				while(in.read(b)!=-1){
					str1 = new String(b);
					System.out.println(str1);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		if(str.equals(str1)){
			bl = true;
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
		}
		
		
		
		return bl;
	}
}
