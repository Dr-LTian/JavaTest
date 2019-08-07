package student_interface;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		/**
		 * 构造10个学生对象放入数组中，然后调用Arrays.sort()方法将数组中的元素按照学生的学号降序排列。
		 */
		//创建一个长度为10的Student类型的数组	
		Student [] stu = new Student[10];
		//为数组赋值			int  id,String  name,String birthday
		stu[0] = new Student(1001,"九尾","1997-01-01");
		stu[1] = new Student(1009,"八戒","1997-02-01");
		stu[2] = new Student(1008,"七龙珠","1997-01-03");
		stu[3] = new Student(1045,"六耳猕猴","1997-04-01");
		stu[4] = new Student(1026,"五星红旗","1997-01-05");
		stu[5] = new Student(1078,"四平八稳","1997-06-01");
		stu[6] = new Student(1085,"三头流弊","1997-01-07");
		stu[7] = new Student(1019,"二郎神","1997-08-01");
		stu[8] = new Student(1010,"一枝独秀","1997-01-09");
		stu[9] = new Student(1049,"零","1997-10-01");
		//实现(implements)  Comparable<Student>  接口后进行排序(传入的是自定义对象数组)
		Arrays.sort(stu);
		//重写toString()方法后，调用Arrays.toString()方法排序
		System.out.println(Arrays.toString(stu));
		//重写toString()方法后，遍历stu对象数组输出每一个对象的所有属性
		for (Student s : stu) {
			System.out.println(s);
		}
	
	}
}
