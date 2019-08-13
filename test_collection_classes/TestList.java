package test_collection_classes;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		arrayList();
		
	}
	
	public static void arrayList(){
		//List为接口,可以new子类对象ArrayList     创建不定长的数组       只能存放对象，不能存放基本类型
		List<String> lt = new ArrayList<>();
		System.out.println("数组是否为空："+lt.isEmpty());//lt.isEmpty()判空
		//add()方法
		lt.add("喜羊羊");
		lt.add("灰太狼");
		lt.add("泰哥");
		System.out.println(lt.indexOf("泰哥"));//lt.indexOf()方法  判断集合中是否有指定元素，有返回下标，没有返回-1
		System.out.println("直接输出_______________");
		System.out.println(lt);
		lt.set(2, "粉红猪");//lt.set(index, element) 修改指定下标的元素值，，，，下标必须小于size，不然会抛异常
		System.out.println(lt);
		System.out.println(lt.get(2));//lt.get(index)获取对应下标的元素值
		//for循环输出
		System.out.println("for循环输出_____________");
		for(int i=0;i<lt.size();i++) {
			System.out.println(lt.get(i));
		}
		//for-each遍历输出
		System.out.println("for-each遍历输出__________________");
		for (String s : lt) {
			System.out.println(s);
		}
		
		
		//迭代器输出
		System.out.println("迭代器输出___________________");
		Iterator<String> iterator = lt.iterator();//获得迭代器接口
		//while(){}先判断在执行
		while(iterator.hasNext()) {//当迭代器有下一个元素  迭代器最开始下标放在-1位置上
			System.out.println(iterator.next());//获得下一个元素
		}
		
		lt.remove(0);//lt.remove(index)		
		System.out.println(lt);
		lt.remove("灰太狼");//lt.remove(o)
		lt.add(null);//add()方法中可以添加null值，默认放在集合尾部
		System.out.println(lt);
		
		
		ArrayList<Integer> lt1 = new ArrayList<>();
		//ArrayList类中的ensureCapacity(int)可以设置集合的初始容量，会自动扩容。trimToSize()删除多余的容量。
		//容量设置后并不会以null值形式显示出来，容量默认值为1
		lt1.ensureCapacity(7);//lt1.ensureCapacity(minCapacity) 设置集合的初始容量，会自动扩容
		System.out.println(lt1);
		lt1.add(25);
		lt1.add(12);
		System.out.println(lt1);
		lt1.add(0, 78);//lt1.add(index, element)在指定下标处添加元素，其他元素位置顺次后移
		System.out.println(lt1);
		System.out.println(lt1.size());//lt1.size()集合中元素个数
		System.out.println(lt1.contains(45));//lt1.contains(o)集合中是否包含指定元素
		lt1.trimToSize();//trimToSize()删除多余的容量
		System.out.println(lt1);
		lt1.clear();//清除集合中元素
		System.out.println(lt1);		
	}
}
