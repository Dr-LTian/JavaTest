package testexception;

//�����쳣��
public class ExMulti {
	  static void procedure(){
	    try{//���ܳ����쳣�Ĵ����
	      int c[]={1};
	      c[1]=99;
	    
	    }catch(ArrayIndexOutOfBoundsException e){//�������쳣
	      System.out.println("�����±�Խ���쳣��"+e);
	    }  
	  }
	  //����ִ�����
	  public static void main(String args[]){
	      try{//���ܳ����쳣�Ĵ����
	          procedure();
	          int a=1/2;
	          int b=42/a;
	          System.out.println("b="+b);
	      }catch(ArithmeticException e){//�������쳣
	          System.out.println("��0�쳣��"+e);
	      }
	      finally {//�ͷ���Դ		
		}
	      
	  }
	}