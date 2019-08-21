package thread;

public class Test2 {
	/**
	 * 线程状态为：就绪、运行、阻塞                                线程结束后为：终止
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread("自定义线程---1"){//第一种：匿名内部类语法创建线程
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());			
			}
		}.start();;
		
		new Thread (new Runnable(){//第二种：匿名内部类语法创建线程
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());	
			}
			
		},"自定义线程---2").start();
		
		
		//创建多线程
		Runnable ra = new  Runnable(){//一个Runnable实例对象中有一个公有属性
			public String  str = "《悬崖上的金鱼姬》";
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+",共有属性为："+str);	
			}		
		};
		//多个匿名Thread子类对象包裹同一个Runnable实例对象，实现多线程共享同一属性
		new Thread(ra,"自定义多线程---3").start();
		new Thread(ra,"自定义多线程---4").start();
		new Thread(ra,"自定义多线程---5").start();
		
		
	}
}
