package customexception;//自定义异常类

public class QueueFullException extends Exception{//队列空异常
	/**
	 * 自定义两个异常类：QueueFullException和QueueEmptyException。
	 * 修改循环顺序队列Queue类中的put()和get()法，
	 * 当为队列中添加新成员时，如果队列已满，抛出QueueFullException异常；
	 * 当从队列中获取一个成员时，如果队列已空，抛出QueueEmptyException异常。
	 */
	
	public QueueFullException(String message){
		super(message);
	}
	public static void main(String[] args) throws QueueFullException {
		FIFO  fo = new  FIFO(5);
		fo.put(2);
		fo.put(9);
		fo.put(18);
		fo.put(75);
		fo.put(20);
		System.out.println(fo.toString());
		fo.put(65); //此处会产生异常
		
	}
}
