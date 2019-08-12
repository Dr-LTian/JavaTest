package testcalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class Test01 implements Comparable<Test01>{
	//姓名
	String name;
	//生日
	GregorianCalendar  birthday;
	//构造器
	public Test01(){
		
	}
	//带参构造器
	public Test01(String name,GregorianCalendar  birthday){
		this.name = name;
		this.birthday = birthday;
	}
	
	//实现Comparable<T>接口，必须重写compareTo(T o)方法，实现此接口后可调用Arrays.sort()方法按自定义方式进行排序
	@Override
	public int compareTo(Test01 o) {
		if(this.birthday.before(o.birthday)){
			return -1;
		}
		else if(this.birthday.after(o.birthday)){
			return 1;
		}
		else {
			return 0;
		}
	}
	//重写toString()方法
	@Override
	public String toString() {
		return "Test01 ["+name+"的birthday为：" + birthday.get(birthday.YEAR) +"-"+birthday.get(birthday.MONTH)+"-"+birthday.get(birthday.DAY_OF_MONTH)+ "]";
	}
	
	//程序入口
	public static void main(String[] args) throws ParseException {
		//Date类   方法有：getTime()	setTime()
		Date da = new Date();
		System.out.println(da);
		//getTime()方法
		long date1 = da.getTime();
		System.out.println(date1);
		
		Date da2 = new Date(36487526994L);
		System.out.println(da2);
		//setTime()方法
		da2.setTime(1575873368159L);
		System.out.println(da2);
		
		//Calendar类是抽象类，不能直接创建对象，可以通过Calendar.getInstance()方法来创建日历类的子类对象
		Calendar  cr = Calendar.getInstance();
		//获取当前日期的年份
		int year = cr.get(cr.YEAR);
		System.out.println(year);
		//set(int field,int value)：为日历的指定部分设置指定值
		cr.set(cr.YEAR, 2018);
		year = cr.get(cr.YEAR);
		System.out.println(year);
		//GregorianCalendar类  是Calendar类的子类
		GregorianCalendar gr = new GregorianCalendar(1997,01,01);
		GregorianCalendar gr2 = new GregorianCalendar(1997,07,01);
		GregorianCalendar gr3 = new GregorianCalendar(1997,03,06);
		//将创建的GregorianCalendar类对象赋给Test01类对象存放进birthday中，实现按生日排序
		Test01[] ts = new Test01[3];
		ts[0] = new Test01("张三",gr);
		ts[1] = new Test01("李四",gr2);
		ts[2] = new Test01("王五",gr3);
		System.out.println(ts[0].birthday.before(ts[2].birthday));
		System.out.println(ts[2].birthday.after(ts[0].birthday));
		//调用Arrays.sort()方法进行排序
		Arrays.sort(ts);
		for (Test01 s : ts) {
			System.out.println(s.toString());
		}
	
		//before方法
		System.out.println(gr.before(gr2));
		System.out.println(gr.before(gr3));
		System.out.println(gr3.before(gr));
		//after方法
		System.out.println(gr.after(gr2));
		System.out.println(gr.after(gr3));
		System.out.println(gr3.after(gr));
		
		//DateFormat类为抽象类,用来格式化日期，可以通过DateFormat.getInstance()方法创建子类对象
		DateFormat dt = DateFormat.getInstance();
		//SimpleDateFormat类  为DateFormat的子类
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");//(String pattern)
		//pattern(模式字符串中可使用的模式字母):y 年、M 月份、d 月份中的天数、 a am/pm 标记 、H 小时数（0-23）、 h 小时数（1-12） 
		//m 分钟数 、s 秒数、S 毫秒数
		
		//String format(Date date)：把日期对象以指定格式转换为字符串
		String date = sdf.format(da);	
		System.out.println(date);
		//Date parse(String date)：把字符串以指定格式解析为日期对象。
		Date da3 =  sdf.parse(date);//抛出ParseException异常
		System.out.println(da3);
	}
	
}
