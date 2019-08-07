package student_interface;




public class Student implements Comparable<Student>{ //implements  实现接口的关键字    
	/**
	 * 1，自定义学生类(包含编号，姓名，出生日期属性)，实现JDK
		中提供的Comparable接口，构造10个学生对象放入数组中，
		然后调用Arrays.sort()方法将数组中的元素按照学生的学号降序排列。
	 */
	private int   id;
	private String  name;
	private String birthday;	
	
	//构造器
	public Student (int  id,String  name,String birthday){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	
	//构造器
	public Student (){
			
	}
	
	
	//私有属性相应的getter和setter方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
	//重写compareTo()方法
	@Override
	public int compareTo(Student o) {
		//按照学号降序排列（从大到小）
		if(this.id < o.id){
			return 1;
		}
		else if(this.id == o.id){
			return 0;
		}
		else{
			return -1;
		}
		
	}

	//重写toString()方法
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}

	
	
}
