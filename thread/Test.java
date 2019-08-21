package thread;

public class Test {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		new MyThread2("自定义第一线程").start();	
		new Thread(new MyThread(),"自定义第二线程").start();			
		System.out.println("程序结束！");
	}

	//子线程中的异常不能在主线程中处理，即子线程中的异常不能抛出到主线程，必须在子线程中处理
	
	//第一种自定义线程的方法，继承Thread类，继承后可以添加与父类对应的自己的构造器
	
	static class MyThread2 extends Thread{//内部类想要在main方法中调用，必须为静态，因为main方法为静态方法
		//构造器，传入一个自定义线程名
		public MyThread2(String threadName){
			super(threadName);
		}
		
		@Override
		public void run() {
			for (int i = 1; i <= 20; i++) {
				try {
					Thread.sleep(500);//延迟500毫秒
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+",当前线程输出："+i);
			}			
			System.out.println(Thread.currentThread().getName()+",当前线程结束");
		}
		
	}
	
}

//第二种自定义线程的方法，实现Runnable接口，必须重写run()方法，没有父类对应的构造器，所以不能添加与之对应的构造器
 class MyThread implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(800);//延迟800毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+",当前线程输出："+i);
		}			
		System.out.println(Thread.currentThread().getName()+",当前线程结束");
	}
}