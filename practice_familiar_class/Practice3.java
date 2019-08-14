package practice_familiar_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Practice3 implements Comparable<Practice3>{
/**
 * 给定字符串“System up with the top down,Got the city on lock 
down,Drive by in the low ride,Hands high when we fly by,System up with 
the top down,Got the city on lock down,Drive by in the low ride,Hands 
high when we fly by.”，请编程统计其中每个字符出现的次数并按次数降
序输出。
 */
	private String str;
	private int value;
	
	public Practice3(String str,int value){
		this.str = str;
		this.value = value;
	}
	
	public static void main(String[] args) {
		String str ="System up with the top down,Got the city on lock down,Drive by in the low ride,Hands high when we fly by,System up with the top down,Got the city on lock down,Drive by in the low ride,Hands high when we fly by.";	
		createTreeMap(str);
		
	}
	
	public static void createTreeMap(String str){
		
		TreeMap<String, Integer> m = new TreeMap<String, Integer>();
		char [] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			String str1 = Character.toString(ch[i]);
			if(!m.containsKey(str1)){
				m.put(str1, 1);
//				System.out.println(m);
			}
			else {
				m.replace(str1, m.get(str1)+1);
			}	
		}
		//直接输出TreeMap--m中的所有元素
		System.out.println(m);
		//创建一个list集合 List是接口，ArrayList是它的实现类
		//list集合中存放的是 ：  Practice3类型的 ArrayList对象  
		List<Practice3> p = new ArrayList<Practice3>();
		//遍历TreeMap--m中的所有元素
		for (Entry<String, Integer> c : m.entrySet()) {
			//将TreeMap中的键值分别取出放进Practice3()类对象中，将Practice3()类对象存放进List集合中
			p.add(new Practice3(c.getKey(),c.getValue()));
			
		}
		Collections.sort(p);
		System.out.println(p);
		
	}

	
	@Override
	public String toString() {
		return "Practice3 [str=" + str + ", value=" + value + "]";
	}

	@Override
	public int compareTo(Practice3 o) {
		if(this.value>o.value){
			return -1;
		}
		else if(this.value<o.value){
			return 1;
		}
		else{
			return 0;	
		}	
	}

	
}
