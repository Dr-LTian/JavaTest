package test_enumeration_type;

public class Test {
	public static void main(String[] args) {
		//����ö������
		ColarType ct;
		//��ʼ��ö������
		ct = ColarType.GREEN;
		//��������ʼ��
		ColarType ct1 = ColarType.��ɫ;
		ColarType ct2 = ColarType.BLUE;
		
		for (Constellation cn:Constellation.values()) {
            System.out.println("������:"+cn.name()+"\t��������:"+cn.getDesc());
        }	
	}
}

//����ö������
enum  ColarType{
	//����д��Ϊ1�����ֻ���2��Ӣ����ĸȫ��д(���������淶Ϊȫ��д��СдҲ�����������Ƽ�)
	��ɫ,��ɫ,BLUE,GREEN;
}

//����ö��
enum Constellation{
	
	������("�����ʤ"),
	��ţ��("������ʵ"),
	˫����("�����Ʊ�"),
	��з��("���а���"),
	ʨ����("��������"),
	��Ů��("�侲����"),
	�����("���ѹ���"),
	��Ы��("����ռ��"),
	������("����ð��"),
	Ħ����("�͵��̰�"),
	ˮƿ��("��Ƕ���"),
	˫����("���Ӽ���");
	
	 //��������
	 private String desc;
	 //˽�й�����,��ֹ���ⲿ����
	 private Constellation(String desc){
	        this.desc=desc;
	 }
	 
	 //getDesc()����
	 public String getDesc(){
	        return desc;
	 }	 
}