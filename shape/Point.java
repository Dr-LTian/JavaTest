package shape;

public class Point {
	//x坐标
	private int x;
	//y坐标
	private int y;
	
	//带参构造器
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	//无参构造器
	public Point(){
		
	}
	//私有属性相应的getter和setter方法
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
