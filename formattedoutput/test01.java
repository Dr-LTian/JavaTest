package formattedoutput;

public class test01 {
	public static void main(String[] args) {
		System.out.printf("�˽���%1$o,ʮ������%1$x,ʮ����%1$d,ʮ������%2$x\n",46,16);//��������:%1$ָ���ǵ�һ��������%2$�ڶ�������
		//%o:�˽��ƣ�%x��ʮ�����ƣ�%d��ʮ���� ��   %n������ 
		
		System.out.printf("%(10.2f\n",-15976.43f);//%(:�������Ž�������
		System.out.printf("%(10.2f\n",15976.43f);
		
		System.out.printf("%+10.2f\n",-15976.43f);//%+��������ֵķ��ţ�����Ϊ+������Ϊ-
		System.out.printf("%+10.2f\n",15976.43f);
		
		System.out.printf("%-10.2f\n",1573.21);//%-m.nf�����
		System.out.printf("%10.2f\n",1573.21);//Ĭ���Ҷ���
		
		System.out.printf("%b\n",false);//%b:����ֵ
		System.out.printf("%f\n",1234.055f);//%f:���㸡����
		System.out.printf("%e\n",1234.055f);//%e:ָ��������
		System.out.printf("%s\n","abcdefg");//%s:�ַ���
		System.out.printf("%c\n",'��');//%c:�ַ�
		System.out.printf("555%%\n");//%%:%
		System.out.printf("5%n");//%n:��ƽ̨�йصĻ���
		/*���н����
		 �˽���56,ʮ������2e,ʮ����46,ʮ������10
		(15976.43)
		  15976.43
		 -15976.43
		 +15976.43
		1573.21   
		   1573.21
		false
		1234.055054
		1.234055e+03
		abcdefg
		��
		555%
		5
		*/

	}
}
