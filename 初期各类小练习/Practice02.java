package day0729;

public class Practice02 {
	public static void main(String[] args) {
		/**
		 * ���1~100���ڵ�����
		 */
		//�������鳤��
		int len = 0;
		//�ҳ�1~100�����м�������
		for(int i=1;i<=100;i++){
			//�ж��Ƿ�Ϊ����
			if(i%2==1){
				//�����������ȼ�1
				len++;
			}
		}
		int []num = new int[len];
		
		int index = 0;
		
		for(int i=1;i<=100;i++){
			//�ж��Ƿ�Ϊ����
			if(i%2==1){
				//������,�������
				num[index] = i;
				//����һ��λ�ô����һ������
				index++;
			}
		}
		for(int s : num){
			System.out.print(s +"\t");
		}
	}
}
