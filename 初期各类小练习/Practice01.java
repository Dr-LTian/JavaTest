package day0729;

public class Practice01 {
	public static void main(String[] args) {
		//ȥ��ǰ���ַ���
		String str = "asdfghurgfkdvcmcmzdk";
		//ȥ�غ��������
		String newstr = "";
		//�ھ�������ȡ�������ַ��Ƿ�����������
		boolean bl = false;
		//ѭ��ȡ�ַ����������н��бȽ�
		for(int i=0;i < str.length();i++){
			//ȡ�������ַ�
			char ch1 = str.charAt(i);
			//�ж�ȡ�����ַ��Ƿ������������
			if(newstr.contains(String.valueOf(ch1))){
				//���ڣ���־Ϊ����
				bl = true;
			}
			else{
				//�����ھ͸�ֵ
				newstr = newstr + String.valueOf(ch1);
			}
		}
		//������ַ�
		System.out.println(newstr);
	}
}
