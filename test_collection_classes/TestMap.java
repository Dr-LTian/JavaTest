package test_collection_classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestMap implements Comparable<TestMap>{
	private String name;
	private int age;
	
	//私有属性的getter()和setter()方法
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {
		System.out.println("————————————hashMap1()方法输出结果如下：————————————");
		hashMap1();
		System.out.println("————————————treeMap1()方法输出结果如下：————————————");
		treeMap1();
	}
	
	
	
	public static void hashMap1(){
		//Map接口保存HashMap对象
		Map<String, Object> ma = new HashMap<String, Object>();
		
		System.out.println(ma.isEmpty());//判空
		ma.put("aso", 16);
		ma.clear();//清除所有元素
		ma.put("ase", 15);//ma.put(key, value)	存放 ：键--值
		ma.put("a1d", "小虎还乡");
		ma.put("cd7", "功夫小子");
		ma.put("cd6", 78);
		ma.put("a5e", "星猫历险记");
		ma.put("bfr", 36);
		ma.put("a1g", 48);
		
		System.out.println(ma.size());//获取集合中元素个数
		System.out.println(ma.get("ase"));//获取指定键的值（key--value）
		ma.put("bfr", "tom");//map中key不能重复，保证key可以比较大小,     重复后就会覆盖对应键的值
		System.out.println(ma);
		
		
		Map<TestMap, String> map2 = new TreeMap<>();
		map2.put( new TestMap(), "maptest1");
		map2.put( new TestMap(), "maptest2");
		System.out.println(map2);
		//利用Map接口提供的keySet()方法可以遍历map集合  ，，，若想用这个方法必须实现Comparable接口
		
		//获得map集合中所有key的集合。循环key的集合。
		System.out.println("--------ma.keySet()方法遍历-------");
		for (String key : ma.keySet()) {
			System.out.println(key + "=" + ma.get(key));
		}
	}
	public static void treeMap1(){
		//Map接口保存HashMap对象
		Map<String, Object> ma = new TreeMap<String, Object>();
		ma.put("aso", 16);
		ma.clear();//清除所有元素
		ma.put("aAe", 15);//ma.put(key, value)	存放 ：键--值
		ma.put("a2d", "小虎还乡");
		ma.put("cd7", "功夫小子");
		ma.put("aa6", 78);
		ma.put("a5e", "星猫历险记");
		ma.put("bfr", 36);
		ma.put("a2g", 48);
		
		//获得map集合中所有key的集合。循环key的集合。
		System.out.println("-----------利用Map接口提供的keySet()方法可以遍历map集合----------");
		for (String key : ma.keySet()) {
			System.out.println(key + "=" + ma.get(key));
		}
		System.out.println("-----------Map中的Entry封装每个key/value对进行迭代输出----------");
		//每次获得一个key/value对，进行迭代。
		for(Entry<String, Object> entry : ma.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}

	
	
	@Override
	public String toString() {
		return "TestMap [name=" + name + ", age=" + age + "]";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestMap other = (TestMap) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(TestMap o) {
		if(this == o){
			return 0;
		}
		if(this.name != null && this.name.compareTo(o.name)<0){
			return -1;
		}
		else if(this.name != null && this.name.compareTo(o.name)>0){
			return 1;
		}
		else{
			if(this.age>o.age) {
				return 1;
			}else if(this.age<o.age) {
				return -1;
			}
		}
		return 0;
	}
}

