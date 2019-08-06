package shape;

public class TestShape {
	public static void main(String[] args) {
		/**
		 * 定义三个派生类Rectangle、Triangle、Circle
		 * 在main方法中，随意构造数个三种派生类的对象，放入 一个数组中。
		 * 最后循环输出数组中的矩形、三角形和圆形的面积area和周长perimeter。
		 */
		Point []pt = {
				//矩形
				new Point(3,4),
				new Point(6,7),
				//三角形
				new Point(1,2),
				new Point(2,4),
				new Point(4,8),
				//圆
				new Point(0,0)
				};
		Shape[] she = {
				new Rectangle(pt[0],pt[1]), //Rectangle( Point point1,Point point2)矩形
				new Triangle(pt[2],pt[3],pt[4]),  //Triangle( Point point1,Point point2,Point point3)三角形
				new Circle(pt[5],5.3)	 //Circle( Point point,double radius)圆
		};
		
		
		for(int i=0;i<she.length;i++){
			System.out.println(she[i].toString());
		}
		
		
	}
}
