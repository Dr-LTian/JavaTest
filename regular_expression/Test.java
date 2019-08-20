package regular_expression;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();
		
		
	}
	
	public static void method1(){
		/**
		 *   对于重复次数的限制，还可使用下列特殊元字符：
		 *  1、 * 表示前面的元素重复0次或多次
		 *  2、 ? 表示前面的元素重复0次或1次 
		 *  3、 + 表示前面的元素重复1次或多次
		 */
		//matches(regex)非静态方法,不能直接通过类名调用,方法内跟一个正则表达式
		System.out.println("asdfghh".matches("a.+h"));//句点.表示任意单个字符
		System.out.println("test".matches("te[sxdg]t"));//[]用来给出取值集合，匹配其中某一个字符，
		System.out.println("abc".matches("[a-z]*"));//在[]中使用-表示范围，如 [0-9] [A-Za-z0-9]等
		System.out.println("sdfg".matches("(sdfg)"));// ()用来界定子表达式，匹配其中的有序序列
		System.out.println("sdfg".matches("(sdefg|dfgh|sdf)g"));// 元字符|表示或的关系
		System.out.println("sdfggg".matches("sdfg{3}"));//元字符{n}表示前面的元素的重复n次；
		System.out.println("sdfggg".matches("sdfg{1,5}"));//{2,5}表示前面的元素重复2到5次；
		System.out.println("sdfggg".matches("sdfg{3,}"));//{3,}表示至少重复3次。
		System.out.println("ddsdfghjkkl".matches(".*(sdfg|hjkl){1,}.*"));
		System.out.println("asdf.cn".matches(".*\\.(com|cn|org)"));// 转义字符\
		System.out.println("123466".matches("^.{6}$"));//元字符^和$， ^代表字符串开始，$代表字符串结束
		System.out.println("asdBghj".matches(".*B[^hjg].*"));// 在[]中使用^表示非
		
		/**
		 * \d == [0-9] \D == [^0-9]
		 * \w == 字母数字下划线 \W == 非字母数字下划线
		 * \s ==所有的空白字符 \S==非空白字符
		 */
		System.out.println("22345678g".matches("\\d+\\D*"));
		System.out.println("fg152__,.,".matches("\\w+\\W+"));
		System.out.println("fg  kk   j   ".matches("((\\S*)\\s*)*"));
	}
	
	public static void method2(){
		/**
		 * String replaceAll(String regex,String replacement)
		 * 将当前字符串中所有和参数regex指定的正则表达式匹配的子串进行替换， 返回新字符串。
		 * 注：replaceAll()方法返回新字符串，并不会改变当前字符串。
		 */
		System.out.println("abcd123456efg".replaceAll("\\d", "佩奇"));
		System.out.println("abcd123456efg".replaceAll("\\d+", "佩奇"));
		System.out.println("abcd123456efg".replaceAll("\\d*", "八戒"));
		System.out.println("abcd123456efg".replaceAll("\\d?", "八戒"));
		
		/**
		 *  String[] split(String regex)  使用参数regex分割当前字符串，返回字符串数组。
		 */
		
		System.out.println(Arrays.toString("asdff11ggh2gfh7jhs9hg".split("\\d")));
		System.out.println(Arrays.toString("asdff11ggh2gfh7jhs9hg".split("\\d+")));
		System.out.println(Arrays.toString("asdff11ggh2gfh7jhs9hg".split("\\d*")));
		System.out.println(Arrays.toString("asdff11ggh2gfh7jhs9hg".split("\\d?")));
		/*运行结果：
		abcd佩奇佩奇佩奇佩奇佩奇佩奇efg
		abcd佩奇efg
		八戒a八戒b八戒c八戒d八戒八戒e八戒f八戒g八戒
		八戒a八戒b八戒c八戒d八戒八戒八戒八戒八戒八戒八戒e八戒f八戒g八戒
		
		
		[asdff, , ggh, gfh, jhs, hg]
		[asdff, ggh, gfh, jhs, hg]
		[a, s, d, f, f, , g, g, h, , g, f, h, , j, h, s, , h, g]
		[a, s, d, f, f, , , g, g, h, , g, f, h, , j, h, s, , h, g]
		*/
	}
	
	public static void  method3(){
		/**
		 * 模式匹配就是检索和指定模式相匹配的字符串。
		 * 在java.util.regex包中，包括了两个类，Pattern(模式)和Matcher(匹配器)。
		 * Pattern对象表示经编译的正则表达式。
		 * Matcher对象代表一个匹配器。
		 * 使用Pattern类中的静态方法compile( String regex)可将正则表达式字符串编译成Pattern对象。
		 * 使用Pattern实例的matcher(CharSequence input)方法可获得一个Matcher实例。
		 */
		String str = "verybody’s business is nobody’s business"+
				"There are four people named everybody, somebody, anybody and nobody. "+
				"There was an important job to be done and everybody was asked to do it."+
				" Everybody was sure that somebody would do it. Anybody could have done it,"+
				" but nobody did it. Some body got angry about that because it was everybody’s job. "+
				"Everybody thought anybody could do it, but nobody realized that everybody wouldn’t do it. "+
				"It ended up that everybody blamed somebody when nobody did what anybody could have done. "+
				"有四个人分别叫做：“每个人”、“某个人”、“任何人”和“没有人”。 "+
				"有一次，他们每个人都要被要求去完成一件重要的工作。 "+
				"大家都相信某个人会去做这件事。其实，任何人都可以完成这项工作的，但就是没有人去做。 "+
				"某个人对此感到非常气愤，因为这是大家的任务。每个人都认为任何人可以完成这件事，但没有人认识到大家都不会去做这件事。 "+
				"结果呢，当没有人去做其实任何人都可以做到的事情的时候，每个人都在抱怨某个人。";
		Pattern pat1 = Pattern.compile("(\\S+)");//Pattern(模式)----static compile(String regex) 方法创建一个Pattern(模式)对象。
		System.out.println(pat1.pattern());//Pattern类的方法 ---String pattern()方法返回模式对象中的正则表达式字符串。
		System.out.println(Pattern.matches(".*", str));//Pattern类的方法 ---static boolean matches(String regex, CharSequence  input)方法判断input是否能被regex匹配
		Pattern pat2 = Pattern.compile("(\\s+)");
		System.out.println(Arrays.toString(pat2.split(str)));//Pattern类的方法 ---String[] split(CharSequence input)方法将input按照正则表达式规则分割成字符串数组。
		
		Matcher mat1 = pat1.matcher(str);//Matcher(匹配器)----Matcher matcher(CharSequence input)方法返回一个Matcher(匹配器)对象
		System.out.println(mat1.matches());//Matcher类的方法---boolean matches()方法，判断input是否完全和regex匹配。
		System.out.println(mat1.lookingAt());//Matcher类的方法---Boolean lookingAt()方法返回字符串是否以regex模式开头。
		
		
		String str3 =mat1.replaceFirst("123");
		System.out.println(str3);
		
		
		//记录按正则表达式划分的子串总数
		int i = 0;	
		//Matcher对象的find()方法可对目标字符串进行匹配检索。
		//Matcher实例会自动保存状态，每次调用find()方法会从上次匹配的子串的下一个位置开始检索。
		while(mat1.find()){//boolean find()     boolean find(int start) //从参数start指定位置开始进行regex匹配。
			i++;
			System.out.printf("当前子串:%s开始的下标:%d,结束的下标:%d\n",mat1.group(0),mat1.start(),mat1.end());
//			System.out.println(mat1.group(0));
			//String group()方法，返回当前匹配的子串。想使用group()方法，必须为正则表达式加上(),eg:"(\\S+)"     有几个()代表有几个组
			//group(0)取出符合整个正则表达式的内容，group(1)取出符合第一组内的正则表达式的相应内容，只有一个组且整个正则表达式都在组内时，两者相同
			System.out.println(mat1.group(1));	
		}
		System.out.println("子串总数："+i);
		
		String str2 =mat1.replaceAll("asd");
		System.out.println(str2);//Matcher类的方法---String replaceAll(String replacement) //把input中与regex匹配的子串全部替换为参数replacement得到新字符串。
		
		
		
		
	}
	
}
