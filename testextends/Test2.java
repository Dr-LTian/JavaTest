package testextends;
/**
 * 1.�������������Ÿ���������� ���������
 * 2.һ����ֻ����һ��ֱ�Ӹ���
 * 3.����һ��������ж������
 * 4.һ�������ʵ�ֶ���ӿ�
 * 5.ʵ�ֽӿ�ʱ������д�ӿ��еĳ��󷽷�
 * @author LT
 */
public class Test2 {
	public static void main(String argv[]) {
		//�����������
        Base b = new Base();
        //�������������Ÿ������
        Sub s = (Sub) b;
        
    }
}
//����
class Base {
}
//����1
class Sub extends Base {
}
//����2
class Sub2 extends Base {
}
//�ӿ�1
interface I1{
	abstract void getAge();
}
//�ӿ�2
interface I2{
	abstract void getName();
}
//����3
class  Sub3 implements I1,I2{
	//ʵ�ֽӿ�ʱ������д�ӿ��еĳ��󷽷�
	@Override
	public void getName() {
	}
	//ʵ�ֽӿ�ʱ������д�ӿ��еĳ��󷽷�
	@Override
	public void getAge() {
	}
	
}
