package day0729;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		/**
		 * �ж��ǲ���һ������
		 */
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("������һ������: ");
		//
		String str = sc.next();
		//
		int a = 0;
		boolean bl = false;
		String str1 = str.substring(str.length() - 4);
		String str2 = ".com";
		if (str1.compareTo(str2) != 0) {
			System.out.println("��ʽ����:(��4λ��Ϊ.com)  �ⲻ��һ�����䡣");
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
				System.out.println("��ʽ����:(û��@)   �ⲻ��һ�����䡣");
			}			
			else{
				System.out.println("��ʽ��ȷ������һ�����䡣");
			}

		}
	}
}
