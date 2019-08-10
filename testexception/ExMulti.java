package testexception;

//测试异常类
public class ExMulti {
	  static void procedure(){
	    try{//可能出现异常的代码段
	      int c[]={1};
	      c[1]=99;
	    
	    }catch(ArrayIndexOutOfBoundsException e){//捕获处理异常
	      System.out.println("数组下标越界异常："+e);
	    }  
	  }
	  //程序执行入口
	  public static void main(String args[]){
	      try{//可能出现异常的代码段
	          procedure();
	          int a=1/2;
	          int b=42/a;
	          System.out.println("b="+b);
	      }catch(ArithmeticException e){//捕获处理异常
	          System.out.println("除0异常："+e);
	      }
	      finally {//释放资源		
		}
	      
	  }
	}