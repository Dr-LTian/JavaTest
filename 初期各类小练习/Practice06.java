package day0729;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		/**
		 * 判断给定一段英文文章中的单词数
		 */
		Scanner sc = new Scanner(System.in);
		Practice06 pt = new Practice06();

		System.out.println("请输入一段英文文章：  ");

		String str = sc.nextLine();
		//判断是不是每个单词的第一个字母,是为true
		boolean bl = true;
		//单词个数
		int   count = 0;
		//
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){			
				if(bl){
					count++;
					bl = false;
				}							
			}
			else{
				bl = true;				
			}
		}
		System.out.println("单词总数为： "+count);
	}
}
