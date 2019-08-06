package person;

public class Employee extends Person {
/**
 * �����������һ�� ʵ���������洢Ա����number(����)��
 * Employee��������ʾ��������һ��Ա�������Ĺ�����201��
 */
	private String number;//����
	
	//�޲ι�����
	public Employee(){
		
	}
	
	//���췽��
public Employee(int age,String name,String gender,String number){
		super(age,name,gender);
		this.number = number;
	}

	//void show()����
	void show(){
		System.out.println(getName() + "��һ��Ա��,���Ĺ����ǣ�" + number);
	}
	
	
	//˽��������Ӧ��getter��setter����
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	//Employee ��toString()������д
	@Override
	public String toString() {	
		return super.toString()+"number=" + number + "]";
	}
	
	
	
}
