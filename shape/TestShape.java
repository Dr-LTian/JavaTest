package shape;

public class TestShape {
	public static void main(String[] args) {
		/**
		 * ��������������Rectangle��Triangle��Circle
		 * ��main�����У����⹹����������������Ķ��󣬷��� һ�������С�
		 * ���ѭ����������еľ��Ρ������κ�Բ�ε����area���ܳ�perimeter��
		 */
		Point []pt = {
				//����
				new Point(3,4),
				new Point(6,7),
				//������
				new Point(1,2),
				new Point(2,4),
				new Point(4,8),
				//Բ
				new Point(0,0)
				};
		Shape[] she = {
				new Rectangle(pt[0],pt[1]), //Rectangle( Point point1,Point point2)����
				new Triangle(pt[2],pt[3],pt[4]),  //Triangle( Point point1,Point point2,Point point3)������
				new Circle(pt[5],5.3)	 //Circle( Point point,double radius)Բ
		};
		
		
		for(int i=0;i<she.length;i++){
			System.out.println(she[i].toString());
		}
		
		
	}
}
