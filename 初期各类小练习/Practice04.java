package day0729;

public class Practice04 {
	public static void main(String[] args) {
		/**
		 * asd_sfd_cmd_fggk   ȡ���ڶ����ո�͵������ո�֮���ֵ
		 */
		//��׼�ַ���
		String str = "asd_sfd_cmd_fggk";
		//������һ���ո���±�		
		int num1 = str.lastIndexOf("_");
		//�����ڶ����ո���±�
		int num2 = str.lastIndexOf("_",num1-1);
		//��ȡ��׼�ַ����е�����һ���ո�͵����ڶ����ո�֮����ַ���
		String str1 = str.substring(num2+1, num1);
		//��ӡ��ȡ���ַ���
		System.out.println(str1);
		str.compareTo(str1);
		str.contains("-");	
	}
}
