package day0729;

public class Practice01 {
	public static void main(String[] args) {
		//去重前的字符串
		String str = "asdfghurgfkdvcmcmzdk";
		//去重后的新数组
		String newstr = "";
		//在旧数组中取出来的字符是否在新数组中
		boolean bl = false;
		//循环取字符与新数组中进行比较
		for(int i=0;i < str.length();i++){
			//取数组中字符
			char ch1 = str.charAt(i);
			//判断取出的字符是否存在新数组中
			if(newstr.contains(String.valueOf(ch1))){
				//存在，标志为存在
				bl = true;
			}
			else{
				//不存在就赋值
				newstr = newstr + String.valueOf(ch1);
			}
		}
		//输出新字符
		System.out.println(newstr);
	}
}
