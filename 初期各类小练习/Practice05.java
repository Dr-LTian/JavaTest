package day0729;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Practice05 pt = new Practice05();

		System.out.println("������һ���ַ�����  ");

		String str = sc.nextLine();

		// ����reverse()����
		String str2 = pt.reverse(str);
		System.out.println();
		System.out.println("�ַ������з�ת���Ϊ��  " + str2);

		// �����Ƿ�Ϊ���ĵ��ж�
		boolean bl = pt.isPalindrome(str);
		System.out.println();
		System.out.println("�Ƿ�Ϊ���ģ�" + bl);

		// ���շ��ص�char����
		char[] str1 = pt.convert2Array(str);
		System.out.println();
		System.out.println("���ص�char����Ϊ��");
		for (char s : str1) {
			System.out.print(s + "\t");
		}
		
		
		
		//����countX()����ͳ�Ʋ����ַ�����ÿ����ĸ���ֵĴ���
		System.out.println();
		int [] num5 = pt.countX(str);
		for(int i=0;i<num5.length;i++){
			System.out.println((char)(i+65) + "  ������  "+num5[i]+"  ��");
		}
		//����dispalyCount()����
		System.out.println();
		pt.dispalyCount(str);
		
		
		
		//����onvertAndSqrt()������������������ַ���ת��Ϊ��ֵ�����ظ���ֵ�� ƽ����
		boolean  bl1 = true;
		for(int i=0;i<str.length();i++){			
			if((int)str.charAt(i)<48 && (int)str.charAt(i)>57){
				bl1 = false;
			}
		}
		if(bl1){
			double  c = pt.convertAndSqrt(str);
			System.out.println();
			System.out.println("����ֵ��ƽ����Ϊ��  " + c);
		}
		
	}

	/**
	 * 1��reverse()�����ܹ���������ַ������з�ת�󷵻ء�
	 */
	public String reverse(String str) {
		// ��ŷ�ת����ַ���
		char[] str1 = new char[str.length()];
		// char�����±�
		int index = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			str1[index] = ch1;
			index--;
		}
		String str2 = String.valueOf(str1);
		return str2;
	}
	
	//�ڶ��ַ�ת����
	public String reverse1(String str) {
		String newstr = "";
		for(int i=str.length()-1;i>0;i--){
			newstr += str.charAt(i);	
		}
		
		return  newstr;
	}
	
	
	/**
	 * 2��isPalindrome ()�����ܹ����������ַ����Ƿ�Ϊ�����ġ������� boolean�����
	 */
	public boolean isPalindrome(String str) {
		boolean bl = true;
		// �������ȡֵ
		for (int i = 0; i < str.length() / 2; i++) {
			char ch1 = str.charAt(i);
			// �ڲ㵹��ȡֵ
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
			System.out.println(str + "   :����һ�������ַ���");
		} else {
			System.out.println(str + "   ������ַ������ǻ���");
		}
		return bl;
	}

	/**
	 * 3��convert2Array()������������ַ���ת��Ϊ�ַ����鷵�ء���ʾ�� ����ʹ��toCharArray() ������
	 */
	public char[] convert2Array(String str) {
		// ��ŷ�ת����ַ���
		char[] str1 = new char[str.length()];
		// char�����±�
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
	 * 4��countX()����ͳ�Ʋ����ַ�����ÿ����ĸ���ֵĴ���������int�����
	 */
	public int[] countX(String str) {
		int [] num5 = new int[26];
		
		for(int i=0;i<str.length();i++){
			char ch5 = str.charAt(i);
			if(str.charAt(i)>'Z' && str.charAt(i)<'a' || str.charAt(i)>'z' ||  str.charAt(i)<'A'){
				System.out.println(ch5+"\t:������ĸ");
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
	 * 5��dispalyCount()ͳ�ƴ�����ַ����е���ĸ�������Լ������ַ��� ����������ʾ��
	 */
	public void dispalyCount(String str) {
		//��ĸ����
		int sum1 = 0;
		//���ָ���
		int sum2 = 0;
		//�����ַ�����
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
		System.out.println("�ַ�������ĸ�ĸ�����  " +sum1);
		System.out.println("�ַ��������ֵĸ�����  " +sum2);
		System.out.println("�ַ����������ַ��ĸ�����  " +sum3);
	}

	/**
	 * 6��convertAndSqrt()������������ַ���ת��Ϊ��ֵ�����ظ���ֵ�� ƽ������ ���磺������"144",�򷵻���ֵ12.
	 */
	public double convertAndSqrt(String str){		
		double a = Double.valueOf(str);
		
		double b =Math.sqrt(a);	
		return b;
	}
}
