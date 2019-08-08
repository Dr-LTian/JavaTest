package strconvertint;

import java.util.Scanner;

public class ParameterInvalidException extends RuntimeException {
/**
 * 自定义int convert(String value) 方法，该方法用来将字符串转换为整数，
 * 如果输入参数有非法字符，则抛出ParameterInvalidException异常。
 * ParameterInvalidException类可继承自RuntimeException类。
 */
	public  ParameterInvalidException(String message){
		super(message);
	}
	
	public static void main(String[] args) throws ParameterInvalidException {
		Scanner sc = new Scanner(System.in);
		StrConvertInt st = new StrConvertInt();
		//提示用户输入一个字符串
		System.out.println("请输入一个字符串类型的整数或浮点数:   ");
		String str = sc.nextLine();
		System.out.println("字符合法，转换后的值为："+st.convert(str));
	}
	
	
}
