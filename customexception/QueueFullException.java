package customexception;//�Զ����쳣��

public class QueueFullException extends Exception{//���п��쳣
	/**
	 * �Զ��������쳣�ࣺQueueFullException��QueueEmptyException��
	 * �޸�ѭ��˳�����Queue���е�put()��get()����
	 * ��Ϊ����������³�Աʱ����������������׳�QueueFullException�쳣��
	 * ���Ӷ����л�ȡһ����Աʱ����������ѿգ��׳�QueueEmptyException�쳣��
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
		fo.put(65); //�˴�������쳣
		
	}
}
