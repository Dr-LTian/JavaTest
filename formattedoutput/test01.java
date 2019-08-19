package formattedoutput;

public class test01 {
	public static void main(String[] args) {
		System.out.printf("八进制%1$o,十六进制%1$x,十进制%1$d,十六进制%2$x\n",46,16);//参数索引:%1$指的是第一个参数，%2$第二个参数
		//%o:八进制；%x：十六进制；%d：十进制 ；   %n：换行 
		
		System.out.printf("%(10.2f\n",-15976.43f);//%(:将负数放进括号内
		System.out.printf("%(10.2f\n",15976.43f);
		
		System.out.printf("%+10.2f\n",-15976.43f);//%+：输出数字的符号，正数为+，负数为-
		System.out.printf("%+10.2f\n",15976.43f);
		
		System.out.printf("%-10.2f\n",1573.21);//%-m.nf左对齐
		System.out.printf("%10.2f\n",1573.21);//默认右对齐
		
		System.out.printf("%b\n",false);//%b:布尔值
		System.out.printf("%f\n",1234.055f);//%f:定点浮点数
		System.out.printf("%e\n",1234.055f);//%e:指数浮点数
		System.out.printf("%s\n","abcdefg");//%s:字符串
		System.out.printf("%c\n",'滚');//%c:字符
		System.out.printf("555%%\n");//%%:%
		System.out.printf("5%n");//%n:与平台有关的换行
		/*运行结果：
		 八进制56,十六进制2e,十进制46,十六进制10
		(15976.43)
		  15976.43
		 -15976.43
		 +15976.43
		1573.21   
		   1573.21
		false
		1234.055054
		1.234055e+03
		abcdefg
		滚
		555%
		5
		*/

	}
}
