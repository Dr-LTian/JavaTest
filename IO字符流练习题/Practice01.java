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
 * ��̶�ȡ�ı��ļ�test.txt�е����ݣ�ͳ���ַ������Լ����顱���⡱���ֵĴ���������ʾ�ڿ���̨�ϡ�
 */
	public static void main(String[] args) {
		//����һ���ļ�����
		show(new File("test.txt"));//�ڶ�Ӧ��Ŀ�´�����txt�ļ���Ȼ���ļ�������ô���show()�������ļ������������
	}
	
	public static void show(File filename){
		
		BufferedReader br = null;	
		InputStreamReader rin = null;
//		OutputStreamWriter wout = null;
		try {
//			wout = new OutputStreamWriter(new FileOutputStream("test.txt",true),"UTF-8");
//			wout.write("�׹���Ů0000001����   ffffff����\r\n");
//			wout.flush();
			
			
			rin = new InputStreamReader(new FileInputStream(filename));
			br = new BufferedReader(rin);
			//����һ�����ַ������ÿ��ȡ����ÿ���ļ�
			String str = null;
			//����һ���ɱ��ַ����������ļ����������ݣ�����Ĭ��Ϊ�ա�     
			//ע�⣺��������д��StringBuffer strb = null�������ֱ������д�����൱�ڶ�����һ�����ַ���������ַ�����д���ˣ�Ҳ��һֱΪ�գ����������渳ֵ
			StringBuffer strb = new StringBuffer();
			//ͳ���ļ��ܹ��ж�����
			int sum = 0;
			//�����ǰ�в�Ϊ�վ�ȡ����ǰ���ļ���Ž��ַ���str
			while((str= br.readLine())!= null){
				sum++;
				//����ǰ���ļ���Ž��ɱ��ַ�����
				strb.append(str+"\r\n");
				System.out.println(strb);				
			}
			//ͳ�ơ����⡯���ֵĴ���
			int count = 0;
			
			//forѭ������
			for(int i=0;i<strb.length();i++){
				//�жϵ�ǰ�ַ��Ƿ�Ϊ  ����
				if(strb.charAt(i)=='��'){
					//�����ǰ�ַ�Ϊ���� ;���ж���һ���ַ��ǲ��ǣ���
					if(strb.charAt(i+1)=='��'){
						//�������������ͳ��ִ�����һ
						count++;
					}
					//�����������һ�е�������ж���һ�еĵ�һ���ַ��ǲ��ǣ���
					else if(strb.charAt(i+1)=='\r'&& strb.charAt(i+3)=='��'){
						//���ϴ�����һ
						count++;
					}
				}
			}
			
			System.out.println("�ɱ��ַ������ȣ�"+(strb.length()-sum*2)+",[����]���ֵĴ���Ϊ:"+ count);
			
			
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
