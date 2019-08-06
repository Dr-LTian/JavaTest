package person;

public class TestPerson {
	public static void main(String[] args) {
		/**
		 * 编写main()方法，创建一个Person类型数组，分别放入3个
			Executive对象、3个Employee对象和3个Person对象，最后 使用循环显示每个数组元素的信息。
		 */
		Person [] pen = new Person[9];
		pen[0] = new Executive(15,"yi狗子","男","L1001");//管理员   int age,String name,String gender,String number
		pen[1] = new Executive(15,"er狗子","女","L1002");
		pen[2] = new Executive(15,"san狗子","男","L1003");
		pen[3] = new Employee(15,"si狗子","女","L1004");
		pen[4] = new Employee(15,"wu狗子","男","L1005");
		pen[5] = new Employee(15,"liu狗子","女","L1006");
		pen[6] = new Person(15,"qi狗子","男");
		pen[7] = new Person(15,"ba狗子","女");
		pen[8] = new Person(15,"jiu狗子","男");
		
		for(int i=0;i<pen.length;i++){
			System.out.println(pen[i].toString());
		}
	}
}
