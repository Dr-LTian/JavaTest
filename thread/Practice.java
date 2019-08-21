package thread;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Practice {
	/**
	 * 编写程序，在子线程中计算1-1/3+1/5-1/7+1/9-1/11+…前10000项的和，
	 * 在主线程中计算1+1/2!+1/3!+1/4!+1/5!+1/6!+…前1000项的和。
	 * 要求，子线程输出结果之后，主线程才能输出。
	 */
	public static void main(String[] args) {
		
		Thread1 td = new Thread1("自定义子线程");
		td.start();
		try {
			td.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		double count = 0;
		for (int i = 1; i <= 20; i++) {
			count += 1/getFactorial(i);
		}
		System.out.println("递归求解：1+1/2!+1/3!+1/4!+1/5!+1/6!+…前20项的和:"+ count);
		
		double total = 0;
		double factorialValue = 1;
		
		int s = 0;
		for(int i=1;i<=1000;i++){
			factorialValue *= i; 
			if(factorialValue>Double.MAX_VALUE){
				s=i;
				System.out.println("到第"+s+"位时，阶乘超过double类型最大值");
				break;
			}	
		}	
		
		factorialValue = 1;
		for(int i=1;i<=s-1;i++){
			factorialValue *= i; 
			total += 1/factorialValue;		
		}	
		System.out.println("1+1/2!+1/3!+1/4!+1/5!+1/6!+…前"+(s-1)+"项的和:"+ total);
	}
	
	//递归求阶乘
	public static double getFactorial(int num){
		double s = 0;
		for(int i=1;i<=num;i++){
			if(i<=2){
				s = num;
			}
			else{
				s = i*getFactorial(i-1);
			}	
		}
		return s;		
	}
}

class Thread1 extends Thread{
	public Thread1(String ThreadName){
		super(ThreadName);
	}
	
	@Override
	public void run() {
		
		double sum = 0;
		
		for (int i = 1; i <= 10000; i++) {		
			if(i%2!=0){
				sum += 1.0/(2*i-1);	
			}
			else{
				sum -= 1.0/(2*i-1);
			}	
		}
		
		System.out.println("1-1/3+1/5-1/7+1/9-1/11+…前10000项的和: "+sum);
	}
}