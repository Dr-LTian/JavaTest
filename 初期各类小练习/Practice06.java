package day0729;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		/**
		 * �жϸ���һ��Ӣ�������еĵ�����
		 */
		Scanner sc = new Scanner(System.in);
		Practice06 pt = new Practice06();

		System.out.println("������һ��Ӣ�����£�  ");

		String str = sc.nextLine();
		//�ж��ǲ���ÿ�����ʵĵ�һ����ĸ,��Ϊtrue
		boolean bl = true;
		//���ʸ���
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
		System.out.println("��������Ϊ�� "+count);
	}
}
