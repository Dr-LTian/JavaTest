package customexception;

import java.util.Arrays;

public class FIFO {
	/**
	 * ���У� FIFO(First In First Out)�� ���еĻ������������(put) ����(get) �жӿ�(isEmpty)
	 * �ж���(isFull)
	 */
	private  int[] nums;
	int index = 0;
	
	
	//������
	public FIFO(){		
	}
	//������
	public FIFO(int size){
		nums = new int[size];
	}
	
	//���
	public void put(int val) throws QueueFullException{
		
		if(index<nums.length){			
			nums[index] = val;
			index++;
		}
		else{			
			throw  new QueueFullException("������ӣ���������");
		}
	}
	
	//����
	public int get() throws QueueEmptyException{
		int a = 0;
		
		if(index>0){				
			a = nums[0];			
			//ȥ����һ��ȡ������ֵ
			for(int i=1;i<nums.length;i++){
					nums[i-1]=nums[i];				
			}
			//ĩβ��0 ����˵ ĩλ��0
			nums[nums.length-1] = 0;
			index--;
		}
		else{
			throw  new QueueEmptyException("���ܳ��ӣ������ѿ�");			
		}
		return a;	
	}
	
	//��ӡ����
	@Override
	public String toString() {		
		return Arrays.toString(nums);
	}
	
	//�жӿ�(isEmpty)
	public boolean isEmpty(){
		//Ĭ��Ϊ��
		boolean bl = true;
		if(index>0){
			bl = false;
			System.out.println("���зǿ�");
		}
		  return bl;
	}
	
	//�ж���(isFull)
	public boolean isFull(){
		//Ĭ��Ϊ����
		boolean bl = false;
		if(index==nums.length){
			bl = true;
			System.out.println("��������");
		}
		  return bl;
	}	
}
