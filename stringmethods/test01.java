package stringmethods;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test01 {
	public static void main(String[] args) {
		System.out.println("abcdefg".contains("ef"));//String.contains()方法，判断字符串里是否包含另一个字符串
		System.out.println("abcdefghijklmn".startsWith("adc"));//String.startsWith()方法,判断字符串是否以另一个字符串开头
		System.out.println("abcdefghijklmn".endsWith("lMn"));//String.endsWith()方法,判断字符串是否以另一个字符串结尾
		System.out.println("abcdefghijklmn".indexOf("lmn"));//String.indexof()方法,从字符串开头查找另一个字符串第一次出现的下标，找不到返回-1
		System.out.println("abcdefghijklmn".lastIndexOf("lm"));//String.lastIndexof()方法,从字符串结尾倒着向前查找另一个字符串第一次出现的下标，找不到返回-1
		System.out.println("   abcdef   ghijk    ".trim());//String.trim()方法，去掉字符串前后两端的空格，中间的无法去掉
		System.out.println("abcdefghijklmn".toCharArray());//String.toCharArray()方法，将字符串转换为char类型数组
		
		System.out.println(String.valueOf("abcdefghijklmn".toCharArray(), 2, 7));//String.valueof(char[] value,int offset,int count)将一个字符数组从第offset位开始，向后取count个字符，将取出的字符包装为String对象
		System.out.println(Arrays.toString("asdjfk中国".getBytes()));//String.getBytes()方法，将字符串转换为byte类型数组
		try {
			System.out.println(Arrays.toString("asdjfk中国".getBytes("utf-8")));
			System.out.println(Arrays.toString("asdjfk中国".getBytes("gbk")));//String.getBytes(String charsetName)方法，将字符串转换为指定编码格斯的byte类型数组
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------");
		
		String str = new String();//无参构造器
		try {
			String str1 = new String("asdjfk".getBytes(),"gbk");//String(byte[] bytes,String charsetName)
			System.out.println(str1);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String str2 = new String("asdjfksjlflf".getBytes(),2,7);//String类的构造器String(byte[] bytes,int offset,int length)
		System.out.println(str2);
		
		String str3 = new String("asdjfksjlflf".toCharArray(),2,7);//String(char[] value,int offset,int count)
		System.out.println(str3);
	}
}
/*运行结果：
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

