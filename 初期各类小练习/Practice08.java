package day0729;

import java.util.Scanner;

public class Practice08 {
	/**
	 * ͨ�����������꣬�£���Ȼ������������ڱ�����ǵڼ���
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		int year = sc.nextInt();
		System.out.println("��������");
		int month = sc.nextInt();
		System.out.println("��������");
		int day = sc.nextInt();
		int sumday = 0;
		for (int i = 1; i < month; i++) {   //ѭ���ж�����
			
			switch (i) {      //switch.....case.....ִֻ��һ��
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				sumday = sumday + 31;
				break;
			case 2:
				// �ܱ�4�����Ҳ��ܱ�100������Ϊ���ꣻ�ܱ�400�����������ꡣ
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					sumday += 29;

				} else {
					sumday += 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				sumday += 30;
				break;
			default:
				System.out.println("��������");
			}
		}
		
		//forѭ�������ۼӣ�ѭ�������ۼӼ���
		sumday = sumday + day;
		//�������ۼӵ�����
		System.out.println(sumday);

	}

}
