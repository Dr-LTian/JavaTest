package shape;

public class Triangle extends Shape { //Triangle ������
	private Point point1; //��1
	private Point point2; //��2
	private Point point3; //��3
	
	boolean bl = false; 
	//�޲ι��췽��
	public Triangle(){
			
	}
		
	//���ι��췽��
	public Triangle( Point point1,Point point2,Point point3){		
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
		
	double area(){//�����
		/**
		 * 2.��֪����������a,b,c����
			�����׹�ʽ����p=(a+b+c)/2��
			S=sqrt[p(p-a)(p-b)(p-c)]
			=sqrt[(1/16)(a+b+c)(a+b-c)(a+c-b)(b+c-a)]
			=1/4sqrt[(a+b+c)(a+b-c)(a+c-b)(b+c-a)]
		 */
		//�������
		double area = 0;
		//�����߳�
		double a = Math.sqrt(Math.pow(point1.getX()-point2.getX(), 2) + Math.pow(point1.getY()-point2.getY(), 2));
		double b = Math.sqrt(Math.pow(point1.getX()-point3.getX(), 2) + Math.pow(point1.getY()-point3.getY(), 2));
		double c = Math.sqrt(Math.pow(point3.getX()-point2.getX(), 2) + Math.pow(point3.getY()-point2.getY(), 2));
		//�ж��Ƿ�Ϊ������
		if((a+b)>c && (a-b)<c && (a+c)>b &&(a-c)<b && (b+c)>a && (b-c)<a){
			bl = true;
			//�������ξͼ������	
			area =1/4.0*Math.sqrt((a+b+c) * (a+b-c) * (a+c-b) * (b+c-a));
		}
		
		return area;
	}
	double perimeter(){ //���ܳ�
		double perimeter = 0;
		double a = Math.sqrt(Math.pow(point1.getX()-point2.getX(), 2) + Math.pow(point1.getY()-point2.getY(), 2));
		double b = Math.sqrt(Math.pow(point1.getX()-point3.getX(), 2) + Math.pow(point1.getY()-point3.getY(), 2));
		double c = Math.sqrt(Math.pow(point3.getX()-point2.getX(), 2) + Math.pow(point3.getY()-point2.getY(), 2));
		//�ж��Ƿ�Ϊ������
		if((a+b)>c && (a-b)<c && (a+c)>b &&(a-c)<b && (b+c)>a && (b-c)<a){
			bl = true;
		//�������ξͼ����ܳ�
			perimeter = a + b + c;
		}			
		return perimeter;	
	}
	
	
	//˽��������Ӧ��getter��setter����
	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	
	
	//
	@Override
	public String toString() {
		
		//�ж��Ƿ�Ϊ������
		perimeter();
		if(bl){
		//�������ξͷ��ؾ���ֵ
			return "������\t�ܳ���" +perimeter()+ "\t�����" +area();
		}
		else{
			return "����������㹹����������";
		}
		
	}
	
	
}
