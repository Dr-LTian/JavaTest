package strconvertint;

public class StrConvertInt {
	int convert(String str) throws ParameterInvalidException{
		//ת���󷵻ص�intֵ
		int val = 0;
		//��һ��С�����������е�λ��
		int index = str.indexOf(".");;
		//ͳ��С�������
		int count = 0;
		
		//ѭ������С����ĸ��� �� �ж�������ַ������ǲ���0~9��С����"."
		for(int i=0;i<str.length();i++){	
			//������ַ�������0~9��С����"."ʱ��ͳ��С����ĸ���
			if(str.charAt(i)>='0' && str.charAt(i)<='9' || str.charAt(i)=='.' ){			 
				if(str.charAt(i)=='.' ){
					count++;	
				}
			}
			//������ַ����в���0~9��С����"."ʱ���׳��쳣
			else{
				throw new ParameterInvalidException("�����ַ����Ƿ���������һ���ַ������͵��������߸�����");				
			}
		}
		//1.���ֻ��һ��С�����Ҳ�����λĩλʱ����ת��   2.û��С����ʱ����ת��
		if(count == 1 && index != 0 && index != str.length()-1 || count == 0){
			val= Integer.valueOf(str.substring(0, index));
		}
		else if(count>1 || index==0 || index==str.length()-1 ){
			throw new ParameterInvalidException("������ַ������͵��������߸������� ��С���㲻ֹһ�� ���� С��������λ��ĩλ");
		}
		
		return val;
	}
}
