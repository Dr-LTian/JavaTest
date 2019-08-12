package testcalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class Test01 implements Comparable<Test01>{
	//����
	String name;
	//����
	GregorianCalendar  birthday;
	//������
	public Test01(){
		
	}
	//���ι�����
	public Test01(String name,GregorianCalendar  birthday){
		this.name = name;
		this.birthday = birthday;
	}
	
	//ʵ��Comparable<T>�ӿڣ�������дcompareTo(T o)������ʵ�ִ˽ӿں�ɵ���Arrays.sort()�������Զ��巽ʽ��������
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
	//��дtoString()����
	@Override
	public String toString() {
		return "Test01 ["+name+"��birthdayΪ��" + birthday.get(birthday.YEAR) +"-"+birthday.get(birthday.MONTH)+"-"+birthday.get(birthday.DAY_OF_MONTH)+ "]";
	}
	
	//�������
	public static void main(String[] args) throws ParseException {
		//Date��   �����У�getTime()	setTime()
		Date da = new Date();
		System.out.println(da);
		//getTime()����
		long date1 = da.getTime();
		System.out.println(date1);
		
		Date da2 = new Date(36487526994L);
		System.out.println(da2);
		//setTime()����
		da2.setTime(1575873368159L);
		System.out.println(da2);
		
		//Calendar���ǳ����࣬����ֱ�Ӵ������󣬿���ͨ��Calendar.getInstance()������������������������
		Calendar  cr = Calendar.getInstance();
		//��ȡ��ǰ���ڵ����
		int year = cr.get(cr.YEAR);
		System.out.println(year);
		//set(int field,int value)��Ϊ������ָ����������ָ��ֵ
		cr.set(cr.YEAR, 2018);
		year = cr.get(cr.YEAR);
		System.out.println(year);
		//GregorianCalendar��  ��Calendar�������
		GregorianCalendar gr = new GregorianCalendar(1997,01,01);
		GregorianCalendar gr2 = new GregorianCalendar(1997,07,01);
		GregorianCalendar gr3 = new GregorianCalendar(1997,03,06);
		//��������GregorianCalendar����󸳸�Test01������Ž�birthday�У�ʵ�ְ���������
		Test01[] ts = new Test01[3];
		ts[0] = new Test01("����",gr);
		ts[1] = new Test01("����",gr2);
		ts[2] = new Test01("����",gr3);
		System.out.println(ts[0].birthday.before(ts[2].birthday));
		System.out.println(ts[2].birthday.after(ts[0].birthday));
		//����Arrays.sort()������������
		Arrays.sort(ts);
		for (Test01 s : ts) {
			System.out.println(s.toString());
		}
	
		//before����
		System.out.println(gr.before(gr2));
		System.out.println(gr.before(gr3));
		System.out.println(gr3.before(gr));
		//after����
		System.out.println(gr.after(gr2));
		System.out.println(gr.after(gr3));
		System.out.println(gr3.after(gr));
		
		//DateFormat��Ϊ������,������ʽ�����ڣ�����ͨ��DateFormat.getInstance()���������������
		DateFormat dt = DateFormat.getInstance();
		//SimpleDateFormat��  ΪDateFormat������
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");//(String pattern)
		//pattern(ģʽ�ַ����п�ʹ�õ�ģʽ��ĸ):y �ꡢM �·ݡ�d �·��е������� a am/pm ��� ��H Сʱ����0-23���� h Сʱ����1-12�� 
		//m ������ ��s ������S ������
		
		//String format(Date date)�������ڶ�����ָ����ʽת��Ϊ�ַ���
		String date = sdf.format(da);	
		System.out.println(date);
		//Date parse(String date)�����ַ�����ָ����ʽ����Ϊ���ڶ���
		Date da3 =  sdf.parse(date);//�׳�ParseException�쳣
		System.out.println(da3);
	}
	
}
