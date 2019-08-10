package familiarclass;

import java.util.Arrays;

public class TestMath {
//	double a = Math.random();//Math.random()产生 [0,1) 之间的值	
	//Math类在java的long包里，不用导包
// Random ran = new Random();	//要导包  import java.util.Random; 
	static char [] ch = new char[62];
	
	
	public static void main(String[] args) {
		//给ch数组赋值
		createString();
		//打印ch2		createStringCh2()返回的字符串
		//createStringCh2().toCharArray()转换回char[]数组
		//Arrays.toString(createStringCh2().toCharArray())将char[]数组转换成带格式的字符串
//		System.out.println(Arrays.toString(createStringCh2().toCharArray()));
		
		//不想来回转换就在方法内转换好在return
		System.out.println(createStringCh2());
	}
	//给数组ch[]赋值
	static void createString(){
		//将'A'--'Z'放进数组ch[]
		for(int i=0;i<26;i++){
			ch[i] = (char)(i+65);
		}
		//将'a'--'z'放进数组ch[]
		for(int i=0;i<26;i++){
			ch[i+26] = (char)(i+97);
		}
		//将'0'--'9'放进数组ch[]
		for(int i=0;i<10;i++){
			ch[i+52] = (char)(i+48);
		}
		//打印数组ch
		System.out.println(Arrays.toString(ch));
	}
	//随机取出十位ch[]数组中的值放进创建的一个长度为10的char数组ch2
	static String createStringCh2(){
		//创建数组ch2
		char [] ch2 = new char[10];
		//赋值
		for(int i=0;i<10;i++){
			ch2[i] = ch[(int)(Math.random()*62)];
		}	
		//将char[]变为字符串后返回
//		return new String (ch2);
		//返回转换好的带格式字符串
		return Arrays.toString(ch2);
	}
	
}
