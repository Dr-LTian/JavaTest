package testextends;

public class Test1 {
	
	  public static void main(String args[]) {
		  	//父类变量保存子类对象  
		  	Parent x = new Child();	
	        System.out.print(x.i); //调用父类属性	        
	        x.f();//调用子类重写后的父类方法
	        Child x1  = (Child )x;//将子类对象放进子类变量
	        System.out.print("" + x1.i);//打印子类的i			"" + x1.i 将int转换为String
	        x1.f();//子类方法
//	        Parent x2 = new Child();			测试在子类构造器中修改父类属性后，父类属性有没有发生改变
//	        System.out.println(x2.i);
	    }
}
//重写方法时不允许降低方法的访问权限
//重载时只看方法名和形参列表；方法名必须相同，形参类型  及  类型的位置   和   形参个数必须  有一个 不相同，只是返回值不同不构成重载
//类编译错误，在static上下文中不能使用this
//final关键词 如果修饰变量，就等同一个常量，定义时必须赋值（初始化），一旦赋值不能再修改
// abstract 必须重写
//final  不能重写
class Parent {
	//父类变量i
    int i = 20;
    int j = 30;
    //父类方法
    void f() {
        System.out.print("" + i);
    }
}

class Child extends Parent {
//    public Child(){	子类继承父类非私有属性后，不能直接给父类非私有属性赋值，必须放在子类的构造器中才可以赋值
//    	i = 30;	//子类在构造器中给父类非私有属性赋值，相当于直接修改父类属性，子类赋值后父类相应属性发生改变
//    }
	//i为子类新增变量，不是从父类继承的i值
	int i = 20;//看起来和父类变量同名，但不是同一个变量
	//子类新增变量
    int k = 40;
    //重写父类方法
    void f() {
        System.out.print(" " + i);
    }
    //子类新增方法
    void g() {
        System.out.print("" + k);
    }  
}