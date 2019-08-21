package thread;

public class Test {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		new MyThread2("�Զ����һ�߳�").start();	
		new Thread(new MyThread(),"�Զ���ڶ��߳�").start();			
		System.out.println("���������");
	}

	//���߳��е��쳣���������߳��д��������߳��е��쳣�����׳������̣߳����������߳��д���
	
	//��һ���Զ����̵߳ķ������̳�Thread�࣬�̳к��������븸���Ӧ���Լ��Ĺ�����
	
	static class MyThread2 extends Thread{//�ڲ�����Ҫ��main�����е��ã�����Ϊ��̬����Ϊmain����Ϊ��̬����
		//������������һ���Զ����߳���
		public MyThread2(String threadName){
			super(threadName);
		}
		
		@Override
		public void run() {
			for (int i = 1; i <= 20; i++) {
				try {
					Thread.sleep(500);//�ӳ�500����
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+",��ǰ�߳������"+i);
			}			
			System.out.println(Thread.currentThread().getName()+",��ǰ�߳̽���");
		}
		
	}
	
}

//�ڶ����Զ����̵߳ķ�����ʵ��Runnable�ӿڣ�������дrun()������û�и����Ӧ�Ĺ����������Բ��������֮��Ӧ�Ĺ�����
 class MyThread implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(800);//�ӳ�800����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+",��ǰ�߳������"+i);
		}			
		System.out.println(Thread.currentThread().getName()+",��ǰ�߳̽���");
	}
}