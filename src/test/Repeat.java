package test;

import java.util.Arrays;

public class Repeat {
	public static void main(String[] args) {
		int a[]=new int[] {23,42,12,84,10};
		System.out.print("ԭ���������ǣ�");
		for(int x:a) {
			System.out.print(x+"\t");
		}
		System.out.println();
		int newa[] = Arrays.copyOfRange(a, 0, 3); 
		//copyOfRange(arr,form,to)���Ƶ��������form,��������to,�����������±�0~2��Ԫ�ص�������
		System.out.println("�����飺");
		for(int b:newa) {
			System.out.print(b+"\t");
		}
	}
}
