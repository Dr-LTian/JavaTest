package customexception;

public class QueueEmptyException extends Exception{
	//���ι�����
	public QueueEmptyException(String message){
		super(message);
	}
	//�޲ι�����
	public QueueEmptyException(){
		
	}
	public static void main(String[] args) throws QueueEmptyException {
		FIFO  fo = new  FIFO(5);		
		fo.get();
	}
}
