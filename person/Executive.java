package person;

public class Executive extends Employee{//������Ա
/**
 * �ٴ�Employee������һ����Executive(������Ա)��Ϊÿ������ӹ��캯����
 * Executive��������ʾ�������Ǹ�������Ա�����Ĺ�����202�� ��
 */
	//�޲ι�����
	public Executive(){
		
	}
	
	//���췽��
	public Executive(int age,String name,String gender,String number){
		super(age,name, gender,number);
	}
	
	//void show()����
	void show(){
		System.out.println(getName() + "��һ��������Ա,���Ĺ����ǣ�" + getNumber());
	}

	//Executive ��toString()������д
	@Override
	public String toString() {
		return super.toString();
	}
		
	
}
