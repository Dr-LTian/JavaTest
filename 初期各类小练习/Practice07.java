package day0729;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		/**
		 * 判断给定一段英文文章中的单词数
		 */
		Scanner sc = new Scanner(System.in);
		Practice07 pt = new Practice07();

		System.out.println("请输入一段英文文章：  ");

		String str = sc.nextLine();  //sc.next()碰到空格就不接收了
		//计数器
		int count = 1;
		
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
				if(str.charAt(i-1)>'Z' && str.charAt(i-1)<'a' || str.charAt(i-1)>'z' ||  str.charAt(i-1)<'A'){
					count ++;
				}
			}
		}
		System.out.println("单词总数为： "+count);
	}
}
