package day0729;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		/**
		 * 判断是不是一个邮箱
		 */
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("请输入一个邮箱: ");
		//
		String str = sc.next();
		//
		int a = 0;
		boolean bl = false;
		String str1 = str.substring(str.length() - 4);
		String str2 = ".com";
		if (str1.compareTo(str2) != 0) {
			System.out.println("格式错误:(后4位不为.com)  这不是一个邮箱。");
		} 
		else {
//			int b = str.indexOf(str2);
			for (int i = 0; i < str.length()-4; i++) {
				char ch1 = str.charAt(i);
				if (ch1 == '@') {
					bl = true;
					a = i;					
				}				
			}
			if (!bl) {
				System.out.println("格式错误:(没有@)   这不是一个邮箱。");
			}			
			else{
				System.out.println("格式正确，这是一个邮箱。");
			}

		}
	}
}
