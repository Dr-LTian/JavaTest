package test_dataxxxputstream;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) {
		dataoutputstream();
		datainputstream();
		 
	}
	
	
	public static void datainputstream(){
		DataInputStream  din = null;
		
		try {
			din = new DataInputStream(new FileInputStream("bjdkf.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(din.readBoolean());
			
			System.out.println(din.readByte());
//			System.out.println(din.readBytes());
			System.out.println(din.readChar());
			System.out.println(din.readDouble());
			System.out.println(din.readUTF());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				din.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public static void dataoutputstream(){
		DataOutputStream  dout = null;
		try {
			dout = new DataOutputStream(new FileOutputStream("bjdkf.txt"));
			dout.writeBoolean(false);
			dout.writeByte(120);
//			dout.writeBytes("猴头@");
			dout.writeChar('G');
			dout.writeDouble(123.4567);
			dout.writeUTF("去年买了个大金表");
			dout.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				dout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
