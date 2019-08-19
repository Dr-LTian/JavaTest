package stringmethods;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test01 {
	public static void main(String[] args) {
		System.out.println("abcdefg".contains("ef"));//String.contains()�������ж��ַ������Ƿ������һ���ַ���
		System.out.println("abcdefghijklmn".startsWith("adc"));//String.startsWith()����,�ж��ַ����Ƿ�����һ���ַ�����ͷ
		System.out.println("abcdefghijklmn".endsWith("lMn"));//String.endsWith()����,�ж��ַ����Ƿ�����һ���ַ�����β
		System.out.println("abcdefghijklmn".indexOf("lmn"));//String.indexof()����,���ַ�����ͷ������һ���ַ�����һ�γ��ֵ��±꣬�Ҳ�������-1
		System.out.println("abcdefghijklmn".lastIndexOf("lm"));//String.lastIndexof()����,���ַ�����β������ǰ������һ���ַ�����һ�γ��ֵ��±꣬�Ҳ�������-1
		System.out.println("   abcdef   ghijk    ".trim());//String.trim()������ȥ���ַ���ǰ�����˵Ŀո��м���޷�ȥ��
		System.out.println("abcdefghijklmn".toCharArray());//String.toCharArray()���������ַ���ת��Ϊchar��������
		
		System.out.println(String.valueOf("abcdefghijklmn".toCharArray(), 2, 7));//String.valueof(char[] value,int offset,int count)��һ���ַ�����ӵ�offsetλ��ʼ�����ȡcount���ַ�����ȡ�����ַ���װΪString����
		System.out.println(Arrays.toString("asdjfk�й�".getBytes()));//String.getBytes()���������ַ���ת��Ϊbyte��������
		try {
			System.out.println(Arrays.toString("asdjfk�й�".getBytes("utf-8")));
			System.out.println(Arrays.toString("asdjfk�й�".getBytes("gbk")));//String.getBytes(String charsetName)���������ַ���ת��Ϊָ�������˹��byte��������
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------");
		
		String str = new String();//�޲ι�����
		try {
			String str1 = new String("asdjfk".getBytes(),"gbk");//String(byte[] bytes,String charsetName)
			System.out.println(str1);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String str2 = new String("asdjfksjlflf".getBytes(),2,7);//String��Ĺ�����String(byte[] bytes,int offset,int length)
		System.out.println(str2);
		
		String str3 = new String("asdjfksjlflf".toCharArray(),2,7);//String(char[] value,int offset,int count)
		System.out.println(str3);
	}
}
/*���н����
true
false
false
11
11
abcdef   ghijk
abcdefghijklmn
cdefghi
[97, 115, 100, 106, 102, 107, -42, -48, -71, -6]
[97, 115, 100, 106, 102, 107, -28, -72, -83, -27, -101, -67]
[97, 115, 100, 106, 102, 107, -42, -48, -71, -6]
----------------------------------------------
asdjfk
djfksjl
djfksjl
*/

