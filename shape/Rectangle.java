package shape;

public class Rectangle extends Shape {
	private Point point1; //�Խǵ�1
	private Point point2; //�Խǵ�2
	
	//�޲ι��췽��
	public Rectangle(){
			
	}
		
	//���ι��췽��
	public Rectangle( Point point1,Point point2){
		this.point1 = point1;
		this.point2 = point2;
		
	}
	
	double area(){//�����
		double a = Math.sqrt(Math.pow(point1.getX()-point2.getX(), 2));
		double b = Math.sqrt(Math.pow(point1.getY()-point2.getY(), 2));		
		double area = a * b;
		return area;
	}
	
	double perimeter(){ //���ܳ�
		double a = Math.sqrt(Math.pow(point1.getX()-point2.getX(), 2));
		double b = Math.sqrt(Math.pow(point1.getY()-point2.getY(), 2));	
		double perimeter = (a + b) * 2 ;
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
	
	//
	@Override
	public String toString() {
		return "����\t�ܳ���" +perimeter()+ "\t�����" +area();
	}
	
	/*  //Rectangle����
	private double [] point1 = new double[2]; //�Խǵ�1
	private double [] point2 = new double[2]; //�Խǵ�2
	
	//�޲ι��췽��
	public Rectangle(){
		
	}
	
	//���ι��췽��
	public Rectangle(double[] point1,	double []point2){
		this.point1 = point1;
		this.point2 = point2;
	}
	
	double area(){//����ͼ�ε����		
		double area = Math.sqrt(Math.pow(point1[0]-point2[0], 2)) * Math.sqrt(Math.pow(point1[1]-point2[1], 2));
		return area;
	}
	
	double perimeter(){//����ͼ�ε��ܳ�
		double perimeter = (Math.sqrt(Math.pow(point1[0]-point2[0], 2)) + Math.sqrt(Math.pow(point1[1]-point2[1], 2))) * 2;
		return perimeter;
	}

	
	//˽��������Ӧ��getter��setter����
	public double[] getPoint1() {
		return point1;
	}

	public void setPoint1(double[] point1) {
		this.point1 = point1;
	}

	public double[] getPoint2() {
		return point2;
	}

	public void setPoint2(double[] point2) {
		this.point2 = point2;
	}		
*/
	}
