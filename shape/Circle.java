package shape;

public class Circle extends Shape{//Circle 圆
	private Point point;//圆心
	private double radius;//半径
	
	
	//无参构造方法
	public Circle(){
				
	}
			
	//带参构造方法
	public Circle( Point point,double radius){
		this.point = point;
		this.radius = radius;
			
	}

	double area(){ //求面积		
		double area = Math.PI * radius * radius ;
		return area;
	}
	
	double perimeter(){ //求周长		
		double perimeter=2 * Math.PI * radius;
		return perimeter;
		
	}

	//私有属性相应的getter和setter方法
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
		return  "圆\t周长：" +perimeter()+ "\t面积：" +area();
	}
}
