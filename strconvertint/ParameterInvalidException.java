package strconvertint;

import java.util.Scanner;

public class ParameterInvalidException extends RuntimeException {
/**
 * �Զ���int convert(String value) �������÷����������ַ���ת��Ϊ������
 * �����������зǷ��ַ������׳�ParameterInvalidException�쳣��
 * ParameterInvalidException��ɼ̳���RuntimeException�ࡣ
 */
	public  ParameterInvalidException(String message){
		super(message);
	}
	
	public static void main(String[] args) throws ParameterInvalidException {
		Scanner sc = new Scanner(System.in);
		StrConvertInt st = new StrConvertInt();
		//��ʾ�û�����һ���ַ���
		System.out.println("������һ���ַ������͵������򸡵���:   ");
		String str = sc.nextLine();
		System.out.println("�ַ��Ϸ���ת�����ֵΪ��"+st.convert(str));
	}
	
	
}
