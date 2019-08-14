package practice_familiar_class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class practice2 {
/**
 * 对于用户的email地址数据：
zhang@sohu.com
lisi@163.com
wangwu@sina.com
zhangsan@qq.com
编写程序取出email数据中的用户名，以用户名为key，对应的邮件地
址作为value存入HashMap。
最后遍历输出HashMap中的所有数据。
 */
	public static void main(String[] args) {
		List<String> lt = new ArrayList<String>();
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入要存放的邮箱，输入“结束”停止存放：");
		String emails = sc.next();//next()不能接受空格，遇到空格就不接受后面的值 
		while(!emails.equals("结束")){
			lt.add(emails);
			emails = sc.next();
		}
		createHashMap(lt);
	}
	
	public static void createHashMap(List<String> lt){
		
		Map<String, String> m = new HashMap<String, String>();
		for(String list:lt){
			String key = list.substring(0, list.indexOf("@"));
			m.put(key, list);
		}
		System.out.println(m);
		
		for (Entry<String, String> hp : m.entrySet()) {
			System.out.println(hp.getKey()+"----"+hp.getValue());
		}
	}
}
