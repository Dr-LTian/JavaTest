package thread;

public class Test2 {
	/**
	 * �߳�״̬Ϊ�����������С�����                                �߳̽�����Ϊ����ֹ
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread("�Զ����߳�---1"){//��һ�֣������ڲ����﷨�����߳�
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());			
			}
		}.start();;
		
		new Thread (new Runnable(){//�ڶ��֣������ڲ����﷨�����߳�
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());	
			}
			
		},"�Զ����߳�---2").start();
		
		
		//�������߳�
		Runnable ra = new  Runnable(){//һ��Runnableʵ����������һ����������
			public String  str = "�������ϵĽ��㼧��";
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+",��������Ϊ��"+str);	
			}		
		};
		//�������Thread����������ͬһ��Runnableʵ������ʵ�ֶ��̹߳���ͬһ����
		new Thread(ra,"�Զ�����߳�---3").start();
		new Thread(ra,"�Զ�����߳�---4").start();
		new Thread(ra,"�Զ�����߳�---5").start();
		
		
	}
}
