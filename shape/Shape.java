package shape;

public abstract class Shape {
	/**
	 * 2��ֱ������ϵ�е�һ�����ο��������Խǵ�ȷ���������ο���������ȷ����һ��Բ����һ�����һ���뾶ȷ����
	 * 
		�붨�������Shape�����³��󷽷���
		double area(); //����ͼ�ε����
		double perimeter(); //����ͼ�ε��ܳ�
		Ȼ��������������Rectangle��Triangle��Circle��
		
	 */
	abstract double area();
	abstract double perimeter();
}
