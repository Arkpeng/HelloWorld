package InnerClass;

import java.util.Scanner;

class Outer{
	public void method(int i,int j) {
		class Inner{
			public void mul(int i,int j) {
				System.out.println("���Ϊ��"+i*j);;
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
		System.out.println("������������");
		int s1 = sc.nextInt();
		System.out.println("��������һ������:");
		int s2 = sc.nextInt();
		Outer ot = new Outer();
		ot.method(s1, s2);
	}
}
