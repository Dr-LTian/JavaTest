package day0729;

import java.util.Scanner;

public class Practice08 {
	/**
	 * 通过键盘输入年，月，日然后输出该日期在本年度是第几天
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年");
		int year = sc.nextInt();
		System.out.println("请输入月");
		int month = sc.nextInt();
		System.out.println("请输入日");
		int day = sc.nextInt();
		int sumday = 0;
		for (int i = 1; i < month; i++) {   //循环判断条件
			
			switch (i) {      //switch.....case.....只执行一次
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
				// 能被4整除且不能被100整除的为闰年；能被400整除的是闰年。
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
				System.out.println("输入有误");
			}
		}
		
		//for循环外面累加，循环几次累加几次
		sumday = sumday + day;
		//输出最后累加的天数
		System.out.println(sumday);

	}

}
