package day0729;

public class Practice04 {
	public static void main(String[] args) {
		/**
		 * asd_sfd_cmd_fggk   取出第二个空格和第三个空格之间的值
		 */
		//基准字符串
		String str = "asd_sfd_cmd_fggk";
		//倒数第一个空格的下标		
		int num1 = str.lastIndexOf("_");
		//倒数第二个空格的下标
		int num2 = str.lastIndexOf("_",num1-1);
		//截取基准字符串中倒数第一个空格和倒数第二个空格之间的字符串
		String str1 = str.substring(num2+1, num1);
		//打印截取的字符串
		System.out.println(str1);
		str.compareTo(str1);
		str.contains("-");	
	}
}
