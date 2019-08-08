package strconvertint;

public class StrConvertInt {
	int convert(String str) throws ParameterInvalidException{
		//转换后返回的int值
		int val = 0;
		//第一个小数点在数组中的位置
		int index = str.indexOf(".");;
		//统计小数点个数
		int count = 0;
		
		//循环计算小数点的个数 和 判断输入的字符串中是不是0~9或小数点"."
		for(int i=0;i<str.length();i++){	
			//输入的字符串中是0~9或小数点"."时，统计小数点的个数
			if(str.charAt(i)>='0' && str.charAt(i)<='9' || str.charAt(i)=='.' ){			 
				if(str.charAt(i)=='.' ){
					count++;	
				}
			}
			//输入的字符串中不是0~9或小数点"."时，抛出异常
			else{
				throw new ParameterInvalidException("输入字符串非法，请输入一个字符串类型的整数或者浮点数");				
			}
		}
		//1.如果只有一个小数点且不再首位末位时可以转换   2.没有小数点时可以转换
		if(count == 1 && index != 0 && index != str.length()-1 || count == 0){
			val= Integer.valueOf(str.substring(0, index));
		}
		else if(count>1 || index==0 || index==str.length()-1 ){
			throw new ParameterInvalidException("输入的字符串类型的整数或者浮点数中 ：小数点不止一个 或者 小数点在首位或末位");
		}
		
		return val;
	}
}
