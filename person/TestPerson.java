package person;

public class TestPerson {
	public static void main(String[] args) {
		/**
		 * ��дmain()����������һ��Person�������飬�ֱ����3��
			Executive����3��Employee�����3��Person������� ʹ��ѭ����ʾÿ������Ԫ�ص���Ϣ��
		 */
		Person [] pen = new Person[9];
		pen[0] = new Executive(15,"yi����","��","L1001");//����Ա   int age,String name,String gender,String number
		pen[1] = new Executive(15,"er����","Ů","L1002");
		pen[2] = new Executive(15,"san����","��","L1003");
		pen[3] = new Employee(15,"si����","Ů","L1004");
		pen[4] = new Employee(15,"wu����","��","L1005");
		pen[5] = new Employee(15,"liu����","Ů","L1006");
		pen[6] = new Person(15,"qi����","��");
		pen[7] = new Person(15,"ba����","Ů");
		pen[8] = new Person(15,"jiu����","��");
		
		for(int i=0;i<pen.length;i++){
			System.out.println(pen[i].toString());
		}
	}
}
