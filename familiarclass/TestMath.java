package familiarclass;

import java.util.Arrays;

public class TestMath {
//	double a = Math.random();//Math.random()���� [0,1) ֮���ֵ	
	//Math����java��long������õ���
// Random ran = new Random();	//Ҫ����  import java.util.Random; 
	static char [] ch = new char[62];
	
	
	public static void main(String[] args) {
		//��ch���鸳ֵ
		createString();
		//��ӡch2		createStringCh2()���ص��ַ���
		//createStringCh2().toCharArray()ת����char[]����
		//Arrays.toString(createStringCh2().toCharArray())��char[]����ת���ɴ���ʽ���ַ���
//		System.out.println(Arrays.toString(createStringCh2().toCharArray()));
		
		//��������ת�����ڷ�����ת������return
		System.out.println(createStringCh2());
	}
	//������ch[]��ֵ
	static void createString(){
		//��'A'--'Z'�Ž�����ch[]
		for(int i=0;i<26;i++){
			ch[i] = (char)(i+65);
		}
		//��'a'--'z'�Ž�����ch[]
		for(int i=0;i<26;i++){
			ch[i+26] = (char)(i+97);
		}
		//��'0'--'9'�Ž�����ch[]
		for(int i=0;i<10;i++){
			ch[i+52] = (char)(i+48);
		}
		//��ӡ����ch
		System.out.println(Arrays.toString(ch));
	}
	//���ȡ��ʮλch[]�����е�ֵ�Ž�������һ������Ϊ10��char����ch2
	static String createStringCh2(){
		//��������ch2
		char [] ch2 = new char[10];
		//��ֵ
		for(int i=0;i<10;i++){
			ch2[i] = ch[(int)(Math.random()*62)];
		}	
		//��char[]��Ϊ�ַ����󷵻�
//		return new String (ch2);
		//����ת���õĴ���ʽ�ַ���
		return Arrays.toString(ch2);
	}
	
}
