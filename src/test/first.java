package test;

import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入x:");
		int x = scan.nextInt();
		System.out.println("请输入y:");
		int y = scan.nextInt();

		boolean m;
		int n;
		m = x == y ? true : false;
		n = x > y ? x : y;
		if (m == true) {
			System.out.println("两个值相等");
		} else if (m == false && n == x) {
			System.out.println(x);
		} else if (m == false && n == y) {
			System.out.println(y);
		}
		scan.close();
	}
}
