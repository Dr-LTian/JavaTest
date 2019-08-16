package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice01 {
/**
 * 编程读取文本文件test.txt中的内容，统计字符总数以及词组”三菱”出现的次数，并显示在控制台上。
 */
	public static void main(String[] args) {
		//传入一个文件对象
		show(new File("test.txt"));//在对应项目下创建此txt文件，然后将文件在这调用传入show()方法，文件内容自行添加
	}
	
	public static void show(File filename){
		
		BufferedReader br = null;	
		InputStreamReader rin = null;
//		OutputStreamWriter wout = null;
		try {
//			wout = new OutputStreamWriter(new FileOutputStream("test.txt",true),"UTF-8");
//			wout.write("白骨妖女0000001三菱   ffffff三林\r\n");
//			wout.flush();
			
			
			rin = new InputStreamReader(new FileInputStream(filename));
			br = new BufferedReader(rin);
			//定义一个空字符串存放每次取出的每行文件
			String str = null;
			//创建一个可变字符串对象存放文件的所有内容，对象默认为空。     
			//注意：不能这样写：StringBuffer strb = null，，如果直接这样写，就相当于定义了一个空字符串；这个字符串就写死了，也就一直为空，不能向里面赋值
			StringBuffer strb = new StringBuffer();
			//统计文件总共有多少行
			int sum = 0;
			//如果当前行不为空就取出当前行文件存放进字符串str
			while((str= br.readLine())!= null){
				sum++;
				//将当前行文件存放进可变字符串中
				strb.append(str+"\r\n");
				System.out.println(strb);				
			}
			//统计‘三菱’出现的次数
			int count = 0;
			
			//for循环查找
			for(int i=0;i<strb.length();i++){
				//判断当前字符是否为  ：三
				if(strb.charAt(i)=='三'){
					//如果当前字符为：三 ;则判断下一个字符是不是：菱
					if(strb.charAt(i+1)=='菱'){
						//符合两个条件就出现次数加一
						count++;
					}
					//如果“王”在一行的最后，则判断下一行的第一个字符是不是：菱
					else if(strb.charAt(i+1)=='\r'&& strb.charAt(i+3)=='菱'){
						//符合次数加一
						count++;
					}
				}
			}
			
			System.out.println("可变字符串长度："+(strb.length()-sum*2)+",[三菱]出现的次数为:"+ count);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
