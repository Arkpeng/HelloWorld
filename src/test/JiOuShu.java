package test;

import java.util.Scanner;

public class JiOuShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("������һ������:");
		long x=scan.nextLong();
		if (x % 2 == 0) {
			System.out.println(x + "��ż��");
		} else {
			System.out.println(x + "������");
		}
		scan.close();
	}
}
