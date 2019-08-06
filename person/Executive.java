package person;

public class Executive extends Employee{//管理人员
/**
 * 再从Employee中派生一个类Executive(管理人员)。为每个类添加构造函数。
 * Executive对象则显示”李四是个管理人员，他的工号是202” 。
 */
	//无参构造器
	public Executive(){
		
	}
	
	//构造方法
	public Executive(int age,String name,String gender,String number){
		super(age,name, gender,number);
	}
	
	//void show()方法
	void show(){
		System.out.println(getName() + "是一个管理人员,他的工号是：" + getNumber());
	}

	//Executive 类toString()方法重写
	@Override
	public String toString() {
		return super.toString();
	}
		
	
}
