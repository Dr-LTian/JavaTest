package student_interface;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		/**
		 * ����10��ѧ��������������У�Ȼ�����Arrays.sort()�����������е�Ԫ�ذ���ѧ����ѧ�Ž������С�
		 */
		//����һ������Ϊ10��Student���͵�����	
		Student [] stu = new Student[10];
		//Ϊ���鸳ֵ			int  id,String  name,String birthday
		stu[0] = new Student(1001,"��β","1997-01-01");
		stu[1] = new Student(1009,"�˽�","1997-02-01");
		stu[2] = new Student(1008,"������","1997-01-03");
		stu[3] = new Student(1045,"����⨺�","1997-04-01");
		stu[4] = new Student(1026,"���Ǻ���","1997-01-05");
		stu[5] = new Student(1078,"��ƽ����","1997-06-01");
		stu[6] = new Student(1085,"��ͷ����","1997-01-07");
		stu[7] = new Student(1019,"������","1997-08-01");
		stu[8] = new Student(1010,"һ֦����","1997-01-09");
		stu[9] = new Student(1049,"��","1997-10-01");
		//ʵ��(implements)  Comparable<Student>  �ӿں��������(��������Զ����������)
		Arrays.sort(stu);
		//��дtoString()�����󣬵���Arrays.toString()��������
		System.out.println(Arrays.toString(stu));
		//��дtoString()�����󣬱���stu�����������ÿһ���������������
		for (Student s : stu) {
			System.out.println(s);
		}
	
	}
}
