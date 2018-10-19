package test;

import java.util.Arrays;

public class Repeat {
	public static void main(String[] args) {
		int a[]=new int[] {23,42,12,84,10};
		System.out.print("原来的数组是：");
		for(int x:a) {
			System.out.print(x+"\t");
		}
		System.out.println();
		int newa[] = Arrays.copyOfRange(a, 0, 3); 
		//copyOfRange(arr,form,to)复制的数组包括form,但不包括to,即复制数组下标0~2的元素到新数组
		System.out.println("新数组：");
		for(int b:newa) {
			System.out.print(b+"\t");
		}
	}
}
