package day0729;

public class Practice02 {
	public static void main(String[] args) {
		/**
		 * 输出1~100以内的奇数
		 */
		//定义数组长度
		int len = 0;
		//找出1~100以内有几个奇数
		for(int i=1;i<=100;i++){
			//判断是否为奇数
			if(i%2==1){
				//是奇数，长度加1
				len++;
			}
		}
		int []num = new int[len];
		
		int index = 0;
		
		for(int i=1;i<=100;i++){
			//判断是否为奇数
			if(i%2==1){
				//是奇数,存进数组
				num[index] = i;
				//换下一个位置存放下一个奇数
				index++;
			}
		}
		for(int s : num){
			System.out.print(s +"\t");
		}
	}
}
