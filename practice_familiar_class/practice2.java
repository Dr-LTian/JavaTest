package practice_familiar_class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class practice2 {
/**
 * �����û���email��ַ���ݣ�
zhang@sohu.com
lisi@163.com
wangwu@sina.com
zhangsan@qq.com
��д����ȡ��email�����е��û��������û���Ϊkey����Ӧ���ʼ���
ַ��Ϊvalue����HashMap��
���������HashMap�е��������ݡ�
 */
	public static void main(String[] args) {
		List<String> lt = new ArrayList<String>();
		Scanner sc =new Scanner(System.in);
		System.out.println("������Ҫ��ŵ����䣬���롰������ֹͣ��ţ�");
		String emails = sc.next();//next()���ܽ��ܿո������ո�Ͳ����ܺ����ֵ 
		while(!emails.equals("����")){
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
