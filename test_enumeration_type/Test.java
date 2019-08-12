package test_enumeration_type;

public class Test {
	public static void main(String[] args) {
		//声明枚举类型
		ColarType ct;
		//初始化枚举类型
		ct = ColarType.GREEN;
		//声明并初始化
		ColarType ct1 = ColarType.红色;
		ColarType ct2 = ColarType.BLUE;
		
		for (Constellation cn:Constellation.values()) {
            System.out.println("星座名:"+cn.name()+"\t星座描述:"+cn.getDesc());
        }	
	}
}

//定义枚举类型
enum  ColarType{
	//常量写法为1、汉字或者2、英文字母全大写(常量命名规范为全大写，小写也不报错，但不推荐)
	绿色,红色,BLUE,GREEN;
}

//星座枚举
enum Constellation{
	
	白羊座("纯真好胜"),
	金牛座("谨慎务实"),
	双子座("好奇善变"),
	巨蟹座("敏感包容"),
	狮子座("自尊自信"),
	处女座("冷静挑剔"),
	天秤座("洒脱公正"),
	天蝎座("感性占有"),
	射手座("自由冒险"),
	摩羯座("低调刻板"),
	水瓶座("睿智独立"),
	双鱼座("复杂极端");
	
	 //中文描述
	 private String desc;
	 //私有构造器,防止被外部调用
	 private Constellation(String desc){
	        this.desc=desc;
	 }
	 
	 //getDesc()方法
	 public String getDesc(){
	        return desc;
	 }	 
}