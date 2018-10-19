package InnerClass;

import java.util.Scanner;

class Outer{
	public void method(int i,int j) {
		class Inner{
			public void mul(int i,int j) {
				System.out.println("结果为："+i*j);;
			}	
		}
		Inner in = new Inner();
		in.mul(i, j);
	}
}
public  class Example2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数：");
		int s1 = sc.nextInt();
		System.out.println("请在输入一个整数:");
		int s2 = sc.nextInt();
		Outer ot = new Outer();
		ot.method(s1, s2);
	}
}
