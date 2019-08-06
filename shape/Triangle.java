package shape;

public class Triangle extends Shape { //Triangle 三角形
	private Point point1; //点1
	private Point point2; //点2
	private Point point3; //点3
	
	boolean bl = false; 
	//无参构造方法
	public Triangle(){
			
	}
		
	//带参构造方法
	public Triangle( Point point1,Point point2,Point point3){		
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
		
	double area(){//求面积
		/**
		 * 2.已知三角形三边a,b,c，则
			（海伦公式）（p=(a+b+c)/2）
			S=sqrt[p(p-a)(p-b)(p-c)]
			=sqrt[(1/16)(a+b+c)(a+b-c)(a+c-b)(b+c-a)]
			=1/4sqrt[(a+b+c)(a+b-c)(a+c-b)(b+c-a)]
		 */
		//定义面积
		double area = 0;
		//求三边长
		double a = Math.sqrt(Math.pow(point1.getX()-point2.getX(), 2) + Math.pow(point1.getY()-point2.getY(), 2));
		double b = Math.sqrt(Math.pow(point1.getX()-point3.getX(), 2) + Math.pow(point1.getY()-point3.getY(), 2));
		double c = Math.sqrt(Math.pow(point3.getX()-point2.getX(), 2) + Math.pow(point3.getY()-point2.getY(), 2));
		//判断是否为三角形
		if((a+b)>c && (a-b)<c && (a+c)>b &&(a-c)<b && (b+c)>a && (b-c)<a){
			bl = true;
			//是三角形就计算面积	
			area =1/4.0*Math.sqrt((a+b+c) * (a+b-c) * (a+c-b) * (b+c-a));
		}
		
		return area;
	}
	double perimeter(){ //求周长
		double perimeter = 0;
		double a = Math.sqrt(Math.pow(point1.getX()-point2.getX(), 2) + Math.pow(point1.getY()-point2.getY(), 2));
		double b = Math.sqrt(Math.pow(point1.getX()-point3.getX(), 2) + Math.pow(point1.getY()-point3.getY(), 2));
		double c = Math.sqrt(Math.pow(point3.getX()-point2.getX(), 2) + Math.pow(point3.getY()-point2.getY(), 2));
		//判断是否为三角形
		if((a+b)>c && (a-b)<c && (a+c)>b &&(a-c)<b && (b+c)>a && (b-c)<a){
			bl = true;
		//是三角形就计算周长
			perimeter = a + b + c;
		}			
		return perimeter;	
	}
	
	
	//私有属性相应的getter和setter方法
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
		
		//判断是否为三角形
		perimeter();
		if(bl){
		//是三角形就返回具体值
			return "三角形\t周长：" +perimeter()+ "\t面积：" +area();
		}
		else{
			return "传入的三个点构不成三角形";
		}
		
	}
	
	
}
