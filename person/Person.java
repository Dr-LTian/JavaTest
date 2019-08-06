package person;

public class Person {
	/**
	 * 定义Person类，它包含数据成员age、name和gender。 从Person中派生一个类Employee(员工)，
	 * 为每个类添加构造函数。
	 * 另外，每个类都提供void show()方法，用来显示对象的信息。
	 * 如果是Person对象，显示 “王五的性别是男，年龄23”；
	 */
	private int age;
	private String name;
	private String gender;//性別
	
	
	
	//无参构造器
	public Person(){
		
	}
	
	//构造方法
	public Person(int age,String name,String gender){
		this.age = age;
		this.gender = gender;
		this.name = name;
	}
	
	//void show()方法
	void show(){
		System.out.println(name + "的性别是" + gender + ",年龄：" + age);
	}

	//私有属性相应的getter和setter方法
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
	
	//Person 类toString()方法重写
	@Override
	public String toString() {
		return "[age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
