package customexception;

public class TestQueueException {
	public static void main(String[] args) {
		FIFO  fo = new  FIFO(5);
		try{						
			fo.put(2);
			fo.put(9);
			fo.put(18);
			fo.put(75);
			fo.put(20);
//			System.out.println(fo.toString());
//			fo.put(65); //�˴�������쳣
			fo.get();
			fo.get();
			fo.get();
			fo.get();
			fo.get();	
			fo.get();//�˴�������쳣
		}
		catch(QueueEmptyException | QueueFullException q){
			QueueEmptyException qee  = new QueueEmptyException();
			if(qee.getClass().toString()== q.getClass().toString()){
				System.out.println("�����ѿ�...");
			}
			else{
				System.out.println("��������...");
			}
//			q.printStackTrace();
				
		}
		finally{
			
		}
}
}
