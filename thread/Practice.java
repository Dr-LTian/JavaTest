package thread;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Practice {
	/**
	 * ��д���������߳��м���1-1/3+1/5-1/7+1/9-1/11+��ǰ10000��ĺͣ�
	 * �����߳��м���1+1/2!+1/3!+1/4!+1/5!+1/6!+��ǰ1000��ĺ͡�
	 * Ҫ�����߳�������֮�����̲߳��������
	 */
	public static void main(String[] args) {
		
		Thread1 td = new Thread1("�Զ������߳�");
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
		System.out.println("�ݹ���⣺1+1/2!+1/3!+1/4!+1/5!+1/6!+��ǰ20��ĺ�:"+ count);
		
		double total = 0;
		double factorialValue = 1;
		
		int s = 0;
		for(int i=1;i<=1000;i++){
			factorialValue *= i; 
			if(factorialValue>Double.MAX_VALUE){
				s=i;
				System.out.println("����"+s+"λʱ���׳˳���double�������ֵ");
				break;
			}	
		}	
		
		factorialValue = 1;
		for(int i=1;i<=s-1;i++){
			factorialValue *= i; 
			total += 1/factorialValue;		
		}	
		System.out.println("1+1/2!+1/3!+1/4!+1/5!+1/6!+��ǰ"+(s-1)+"��ĺ�:"+ total);
	}
	
	//�ݹ���׳�
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
		
		System.out.println("1-1/3+1/5-1/7+1/9-1/11+��ǰ10000��ĺ�: "+sum);
	}
}