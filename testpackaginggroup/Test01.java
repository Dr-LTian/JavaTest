package testpackaginggroup;

public class Test01 {
	public static void main(String[] args) {
		box();
	}

	public static void box(){
		//基本数据类型
		byte b1 = 25;
		short s1 = 125;
		int i1 = 250;
		long l1 = 2525;
		float f1 = 25.1F;
		double d1 = 250.25;
		
		char c1 = '主';
		boolean bn1 = true;
		
		//包装类类型-----数值型包装器类都有一个构造方法能接收字符串，转换为对应的包装类对象，Boolean类型也有，Character类型没有
		Byte b2 = new Byte(b1);
		Byte b3 = new Byte("123");
		
		//将包装类类型转换为基本数据类型,可能存在：1、精度缺失(浮点类型包装类转换为整数型基本数据类型时)
		//或者2、错误(大范围转为小范围数时)   这两点基本等同于基本数据类型间相互转化时出现的错误
		System.out.println("将包装类对象(Byte型的b3)的值取出--为byte基本数据类型："+b3.byteValue());
		System.out.println("将包装类对象(Byte型的b3)的值取出--为short基本数据类型："+b3.shortValue());
		System.out.println("将包装类对象(Byte型的b3)的值取出--为int基本数据类型："+b3.intValue());
		System.out.println("将包装类对象(Byte型的b3)的值取出--为float基本数据类型："+b3.floatValue());
		System.out.println("将包装类对象(Byte型的b3)的值取出--为double基本数据类型："+b3.doubleValue());
		Short s2 = new Short(s1);
		Short s3 = new Short("124");
		
		Integer i2 = new Integer(i1);
		Integer i3 = new Integer("125");
		
		Long l2 = new Long(l1);
		Long l3 = new Long("126");
		
		
		Float f2 = new Float(f1);
		Float f3 = new Float("127");
		
		Double d2 = new Double(d1);
		Double d3 = new Double("128");
		
		//Character类的构造方法只能存放对应的基本数据类型char值Character c2 = new Character(char value);
		Character c2 = new Character(c1);
		//Boolean类型包装器类都有一个构造方法能接收字符串，转换为对应的包装类对象，，，除了“true”外，都是false
		Boolean bn2 = new Boolean(bn1);
		
		Boolean bn3 = new Boolean("true");
		System.out.println("只要是true，不区分大小写，都为true："+bn3);
		Boolean bn4 = new Boolean("amen");
		System.out.println("不是true，都为false："+bn4);
		
		//自动装箱和拆箱
		Integer  i4 = 99;//自动装箱	
		int i5 = i4;//自动拆箱
		
		//仅在数值相同时讨论：           对于boolean、 byte、小于127的char、介于-128~127之间的short和int值或变量，自动装箱时，会被自动装箱到固定的同一个对象中。
		//数值不同时自动装箱肯定不在一个对象
		
		//-128~127数值相同
		Integer i6 = 66;
		Integer i7 = 66;
		System.out.println("-128~127范围内，数值相同："+(i6==i7));	
		//-128~127数值不同
		i6 = 75;
		i7 = 84;
		System.out.println("-128~127范围内，数值不同："+(i6==i7));
		//128及以上数值相同
		i6 = 128;
		i7 = 128;
		System.out.println("128及以上，数值相同："+(i6==i7));
		
		//数值类型中的方法：parseXxx()静态方法，能将字符串转换为对应的基本类型数据。
		int i8 = Integer.parseInt("1258");
		
		//valueOf()静态方法，能将基本类型数据或字符串转换为对应的包装类对象。
		Byte b5 = Byte.parseByte("125");
		
		//数值类型中的方法：数值型包装类都提供2个静态常量MIN_VALUE和MAX_VALUE，可以获得对应基本类型数据的取值范围。
		System.out.println("Byte的取值范围："+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("Short的取值范围："+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("Integer的取值范围："+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		
		//Integer包装类提供1、(转换二进制)toBinaryString(i)、2、(转换八进制)toOctalString(i)、3、(转换十六进制)toHexString(i)3个静态方法，可以将基本类型数据转换为不同进制的字符串表示
		Integer i9 = new Integer(12578145);
		System.out.println("i9的二进制："+Integer.toBinaryString(i9));//二进制
		System.out.println("i9的八进制："+Integer.toOctalString(i9));//八进制
		System.out.println("i9的十六进制："+Integer.toHexString(i9));//十六进制
	}
}
