package customexception;

public class QueueEmptyException extends Exception{
	//带参构造器
	public QueueEmptyException(String message){
		super(message);
	}
	//无参构造器
	public QueueEmptyException(){
		
	}
	public static void main(String[] args) throws QueueEmptyException {
		FIFO  fo = new  FIFO(5);		
		fo.get();
	}
}
