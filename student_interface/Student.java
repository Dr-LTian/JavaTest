package student_interface;




public class Student implements Comparable<Student>{ //implements  ʵ�ֽӿڵĹؼ���    
	/**
	 * 1���Զ���ѧ����(������ţ�������������������)��ʵ��JDK
		���ṩ��Comparable�ӿڣ�����10��ѧ��������������У�
		Ȼ�����Arrays.sort()�����������е�Ԫ�ذ���ѧ����ѧ�Ž������С�
	 */
	private int   id;
	private String  name;
	private String birthday;	
	
	//������
	public Student (int  id,String  name,String birthday){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	
	//������
	public Student (){
			
	}
	
	
	//˽��������Ӧ��getter��setter����
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

	
	//��дcompareTo()����
	@Override
	public int compareTo(Student o) {
		//����ѧ�Ž������У��Ӵ�С��
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

	//��дtoString()����
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}

	
	
}
