package shape;

public class Circle extends Shape{//Circle Բ
	private Point point;//Բ��
	private double radius;//�뾶
	
	
	//�޲ι��췽��
	public Circle(){
				
	}
			
	//���ι��췽��
	public Circle( Point point,double radius){
		this.point = point;
		this.radius = radius;
			
	}

	double area(){ //�����		
		double area = Math.PI * radius * radius ;
		return area;
	}
	
	double perimeter(){ //���ܳ�		
		double perimeter=2 * Math.PI * radius;
		return perimeter;
		
	}

	//˽��������Ӧ��getter��setter����
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//
	@Override
	public String toString() {
		return  "Բ\t�ܳ���" +perimeter()+ "\t�����" +area();
	}
}
