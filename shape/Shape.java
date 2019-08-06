package shape;

public abstract class Shape {
	/**
	 * 2，直角坐标系中的一个矩形可用两个对角点确定，三角形可用三个点确定，一个圆可用一个点和一个半径确定。
	 * 
		请定义抽象类Shape及如下抽象方法：
		double area(); //返回图形的面积
		double perimeter(); //返回图形的周长
		然后定义三个派生类Rectangle、Triangle、Circle。
		
	 */
	abstract double area();
	abstract double perimeter();
}
