package test;

import java.util.Scanner;

public class JiOuShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		long x=scan.nextLong();
		if (x % 2 == 0) {
			System.out.println(x + "是偶数");
		} else {
			System.out.println(x + "是奇数");
		}
		scan.close();
	}
}
