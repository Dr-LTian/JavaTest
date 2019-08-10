package testextends;
/**
 * 1.创建子类变量存放父类对象会产生 ：编译错误
 * 2.一个类只能有一个直接父类
 * 3.但是一个类可以有多个子类
 * 4.一个类可以实现多个接口
 * 5.实现接口时必须重写接口中的抽象方法
 * @author LT
 */
public class Test2 {
	public static void main(String argv[]) {
		//创建父类对象
        Base b = new Base();
        //创建子类变量存放父类对象
        Sub s = (Sub) b;
        
    }
}
//父类
class Base {
}
//子类1
class Sub extends Base {
}
//子类2
class Sub2 extends Base {
}
//接口1
interface I1{
	abstract void getAge();
}
//接口2
interface I2{
	abstract void getName();
}
//子类3
class  Sub3 implements I1,I2{
	//实现接口时必须重写接口中的抽象方法
	@Override
	public void getName() {
	}
	//实现接口时必须重写接口中的抽象方法
	@Override
	public void getAge() {
	}
	
}
