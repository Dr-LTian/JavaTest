package person;

public class Person {
	/**
	 * ����Person�࣬���������ݳ�Աage��name��gender�� ��Person������һ����Employee(Ա��)��
	 * Ϊÿ������ӹ��캯����
	 * ���⣬ÿ���඼�ṩvoid show()������������ʾ�������Ϣ��
	 * �����Person������ʾ ��������Ա����У�����23����
	 */
	private int age;
	private String name;
	private String gender;//�Ԅe
	
	
	
	//�޲ι�����
	public Person(){
		
	}
	
	//���췽��
	public Person(int age,String name,String gender){
		this.age = age;
		this.gender = gender;
		this.name = name;
	}
	
	//void show()����
	void show(){
		System.out.println(name + "���Ա���" + gender + ",���䣺" + age);
	}

	//˽��������Ӧ��getter��setter����
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//Person ��toString()������д
	@Override
	public String toString() {
		return "[age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
