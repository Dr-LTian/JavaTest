package day0729;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		/**
		 * �жϸ���һ��Ӣ�������еĵ�����
		 */
		Scanner sc = new Scanner(System.in);
		Practice07 pt = new Practice07();

		System.out.println("������һ��Ӣ�����£�  ");

		String str = sc.nextLine();  //sc.next()�����ո�Ͳ�������
		//������
		int count = 1;
		
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
				if(str.charAt(i-1)>'Z' && str.charAt(i-1)<'a' || str.charAt(i-1)>'z' ||  str.charAt(i-1)<'A'){
					count ++;
				}
			}
		}
		System.out.println("��������Ϊ�� "+count);
	}
}
