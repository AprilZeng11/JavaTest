package class10.ketang.zuoye;

import java.util.Scanner;

public class Chapter5 {
	public void practice1() {
//		鸡兔同笼，94只脚，35头，问鸡兔各多少只
		for (int chicken=0;chicken<=35;chicken++) {
			for (int rabbit=0;rabbit<=35;rabbit++) {
				if (chicken+rabbit==35 && chicken*2+rabbit*4==94) {
					System.out.println("鸡有" + chicken + "兔子有" + rabbit );
				}
			}
		}
	}
	
	public void practice2() {
//		2.	百钱买百鸡的问题算是一套非常经典的不定方程的问题，题目很简单：
//		公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱， 用100文钱买一百只鸡,其中公鸡，母鸡，小鸡都必须要有，
//		问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱？
		int num = 0;
		for (int a=0;a<=100;a++) {
			for (int b=0;b<=100;b++) {
				for (int c=0;c<=100;c++) {
					if ((a>0&&b>0&&c>0)&&(a*5 + b*3 + c == 100)) {
						num += 1;
						System.out.println("公鸡数量有"+a+"母鸡数量有"+b+"小鸡数量有"+c);
					}
				}
			}
		}
		System.out.println("总方法有："+num); //总方法有：304
	}
	
	public void practice3() {
//		编写一个猜数字的游戏，数字猜对则输出猜对并结束，猜错则继续游戏
		/*System.out.println("请输入一个数字：");
		try {
			int a = System.in.read();
			System.out.println(a);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		int num = 5;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		String a = input.nextLine();
		int b = Integer.parseInt(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Chapter5 ch5 = new Chapter5();
//		ch5.practice1();
//		ch5.practice2();
		ch5.practice3();
				

	}

}
