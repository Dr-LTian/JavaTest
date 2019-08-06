package person;

public class Employee extends Person {
/**
 * 在新类中添加一个 实例域，用来存储员工的number(工号)。
 * Employee对象则显示“张三是一个员工，他的工号是201”
 */
	private String number;//工号
	
	//无参构造器
	public Employee(){
		
	}
	
	//构造方法
public Employee(int age,String name,String gender,String number){
		super(age,name,gender);
		this.number = number;
	}

	//void show()方法
	void show(){
		System.out.println(getName() + "是一个员工,他的工号是：" + number);
	}
	
	
	//私有属性相应的getter和setter方法
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	//Employee 类toString()方法重写
	@Override
	public String toString() {	
		return super.toString()+"number=" + number + "]";
	}
	
	
	
}
