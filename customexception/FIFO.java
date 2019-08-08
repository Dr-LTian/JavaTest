package customexception;

import java.util.Arrays;

public class FIFO {
	/**
	 * 队列： FIFO(First In First Out)。 队列的基本操作：入队(put) 出队(get) 判队空(isEmpty)
	 * 判队满(isFull)
	 */
	private  int[] nums;
	int index = 0;
	
	
	//构造器
	public FIFO(){		
	}
	//构造器
	public FIFO(int size){
		nums = new int[size];
	}
	
	//入队
	public void put(int val) throws QueueFullException{
		
		if(index<nums.length){			
			nums[index] = val;
			index++;
		}
		else{			
			throw  new QueueFullException("不能入队，队列已满");
		}
	}
	
	//出队
	public int get() throws QueueEmptyException{
		int a = 0;
		
		if(index>0){				
			a = nums[0];			
			//去除第一个取出来的值
			for(int i=1;i<nums.length;i++){
					nums[i-1]=nums[i];				
			}
			//末尾补0 或者说 末位置0
			nums[nums.length-1] = 0;
			index--;
		}
		else{
			throw  new QueueEmptyException("不能出队，队列已空");			
		}
		return a;	
	}
	
	//打印数组
	@Override
	public String toString() {		
		return Arrays.toString(nums);
	}
	
	//判队空(isEmpty)
	public boolean isEmpty(){
		//默认为空
		boolean bl = true;
		if(index>0){
			bl = false;
			System.out.println("队列非空");
		}
		  return bl;
	}
	
	//判队满(isFull)
	public boolean isFull(){
		//默认为不满
		boolean bl = false;
		if(index==nums.length){
			bl = true;
			System.out.println("队列已满");
		}
		  return bl;
	}	
}
