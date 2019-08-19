package day0729;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Practice05 pt = new Practice05();

		System.out.println("请输入一个字符串：  ");

		String str = sc.nextLine();

		// 调用reverse()方法
		String str2 = pt.reverse(str);
		System.out.println();
		System.out.println("字符串进行反转后变为：  " + str2);

		// 接收是否为回文的判断
		boolean bl = pt.isPalindrome(str);
		System.out.println();
		System.out.println("是否为回文：" + bl);

		// 接收返回的char数组
		char[] str1 = pt.convert2Array(str);
		System.out.println();
		System.out.println("返回的char数组为：");
		for (char s : str1) {
			System.out.print(s + "\t");
		}
		
		
		
		//调用countX()方法统计参数字符串中每个字母出现的次数
		System.out.println();
		int [] num5 = pt.countX(str);
		for(int i=0;i<num5.length;i++){
			System.out.println((char)(i+65) + "  出现了  "+num5[i]+"  次");
		}
		//调用dispalyCount()方法
		System.out.println();
		pt.dispalyCount(str);
		
		
		
		//调用onvertAndSqrt()方法，将传入的数字字符串转换为数值，返回该数值的 平方根
		boolean  bl1 = true;
		for(int i=0;i<str.length();i++){			
			if((int)str.charAt(i)<48 && (int)str.charAt(i)>57){
				bl1 = false;
			}
		}
		if(bl1){
			double  c = pt.convertAndSqrt(str);
			System.out.println();
			System.out.println("该数值的平方根为：  " + c);
		}
		
	}

	/**
	 * 1、reverse()方法能够将传入的字符串进行反转后返回。
	 */
	public String reverse(String str) {
		// 存放反转后的字符串
		char[] str1 = new char[str.length()];
		// char数组下标
		int index = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			str1[index] = ch1;
			index--;
		}
		String str2 = String.valueOf(str1);
		return str2;
	}
	
	//第二种反转方法
	public String reverse1(String str) {
		String newstr = "";
		for(int i=str.length()-1;i>0;i--){
			newstr += str.charAt(i);	
		}
		
		return  newstr;
	}
	
	
	/**
	 * 2、isPalindrome ()方法能够检查输入的字符串是否为”回文”，返回 boolean结果。
	 */
	public boolean isPalindrome(String str) {
		boolean bl = true;
		// 外层正着取值
		for (int i = 0; i < str.length() / 2; i++) {
			char ch1 = str.charAt(i);
			// 内层倒着取值
			for (int j = str.length() - 1 - i; j > str.length() / 2; j--) {
				char ch2 = str.charAt(j);
				if (ch1 != ch2) {
					bl = false;
					break;
				} else {
					break;
				}
			}
		}
		if (bl) {
			System.out.println(str + "   :这是一个回文字符串");
		} else {
			System.out.println(str + "   ：这个字符串不是回文");
		}
		return bl;
	}

	/**
	 * 3，convert2Array()方法将传入的字符串转换为字符数组返回。提示： 不能使用toCharArray() 方法。
	 */
	public char[] convert2Array(String str) {
		// 存放反转后的字符串
		char[] str1 = new char[str.length()];
		// char数组下标
		int index = 0;
		//
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			str1[index] = ch1;
			// System.out.println(ch1);
			index++;
		}
		// for(char s:str1){
		// System.out.print(s+ "\t");
		// }
		return str1;
	}

	/**
	 * 4，countX()方法统计参数字符串中每个字母出现的次数，返回int结果。
	 */
	public int[] countX(String str) {
		int [] num5 = new int[26];
		
		for(int i=0;i<str.length();i++){
			char ch5 = str.charAt(i);
			if(str.charAt(i)>'Z' && str.charAt(i)<'a' || str.charAt(i)>'z' ||  str.charAt(i)<'A'){
				System.out.println(ch5+"\t:不是字母");
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				 ch5 = (char)(str.charAt(i)-32);
				 num5[ch5-65] = num5[ch5-65] + 1;
			}
			else{
				num5[ch5-65] = num5[ch5-65] + 1;
			}
		}
		
		
		return num5;
	}

	/**
	 * 5，dispalyCount()统计传入的字符串中的字母、数字以及其它字符的 个数，并显示。
	 */
	public void dispalyCount(String str) {
		//字母个数
		int sum1 = 0;
		//数字个数
		int sum2 = 0;
		//其它字符个数
		int sum3 = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				sum2++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
				sum1++;
			}
			else{
				sum3++;
			}
			
		}
		System.out.println("字符串中字母的个数：  " +sum1);
		System.out.println("字符串中数字的个数：  " +sum2);
		System.out.println("字符串中其它字符的个数：  " +sum3);
	}

	/**
	 * 6，convertAndSqrt()将传入的数字字符串转换为数值，返回该数值的 平方根。 比如：若传入"144",则返回数值12.
	 */
	public double convertAndSqrt(String str){		
		double a = Double.valueOf(str);
		
		double b =Math.sqrt(a);	
		return b;
	}
}
