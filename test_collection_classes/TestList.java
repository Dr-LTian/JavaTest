package test_collection_classes;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		arrayList();
		
	}
	
	public static void arrayList(){
		//ListΪ�ӿ�,����new�������ArrayList     ����������������       ֻ�ܴ�Ŷ��󣬲��ܴ�Ż�������
		List<String> lt = new ArrayList<>();
		System.out.println("�����Ƿ�Ϊ�գ�"+lt.isEmpty());//lt.isEmpty()�п�
		//add()����
		lt.add("ϲ����");
		lt.add("��̫��");
		lt.add("̩��");
		System.out.println(lt.indexOf("̩��"));//lt.indexOf()����  �жϼ������Ƿ���ָ��Ԫ�أ��з����±꣬û�з���-1
		System.out.println("ֱ�����_______________");
		System.out.println(lt);
		lt.set(2, "�ۺ���");//lt.set(index, element) �޸�ָ���±��Ԫ��ֵ���������±����С��size����Ȼ�����쳣
		System.out.println(lt);
		System.out.println(lt.get(2));//lt.get(index)��ȡ��Ӧ�±��Ԫ��ֵ
		//forѭ�����
		System.out.println("forѭ�����_____________");
		for(int i=0;i<lt.size();i++) {
			System.out.println(lt.get(i));
		}
		//for-each�������
		System.out.println("for-each�������__________________");
		for (String s : lt) {
			System.out.println(s);
		}
		
		
		//���������
		System.out.println("���������___________________");
		Iterator<String> iterator = lt.iterator();//��õ������ӿ�
		//while(){}���ж���ִ��
		while(iterator.hasNext()) {//������������һ��Ԫ��  �������ʼ�±����-1λ����
			System.out.println(iterator.next());//�����һ��Ԫ��
		}
		
		lt.remove(0);//lt.remove(index)		
		System.out.println(lt);
		lt.remove("��̫��");//lt.remove(o)
		lt.add(null);//add()�����п������nullֵ��Ĭ�Ϸ��ڼ���β��
		System.out.println(lt);
		
		
		ArrayList<Integer> lt1 = new ArrayList<>();
		//ArrayList���е�ensureCapacity(int)�������ü��ϵĳ�ʼ���������Զ����ݡ�trimToSize()ɾ�������������
		//�������ú󲢲�����nullֵ��ʽ��ʾ����������Ĭ��ֵΪ1
		lt1.ensureCapacity(7);//lt1.ensureCapacity(minCapacity) ���ü��ϵĳ�ʼ���������Զ�����
		System.out.println(lt1);
		lt1.add(25);
		lt1.add(12);
		System.out.println(lt1);
		lt1.add(0, 78);//lt1.add(index, element)��ָ���±괦���Ԫ�أ�����Ԫ��λ��˳�κ���
		System.out.println(lt1);
		System.out.println(lt1.size());//lt1.size()������Ԫ�ظ���
		System.out.println(lt1.contains(45));//lt1.contains(o)�������Ƿ����ָ��Ԫ��
		lt1.trimToSize();//trimToSize()ɾ�����������
		System.out.println(lt1);
		lt1.clear();//���������Ԫ��
		System.out.println(lt1);		
	}
}
