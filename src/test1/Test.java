package test1;

import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		float b = 2.5f;
		char d;
		String c =new String("  we are champion  ");
		System.out.println(c.length());		
		System.out.println(c.indexOf("a"));
		System.out.println(c.lastIndexOf("a"));
		d=c.charAt(3);  //获取字符串中下标为3（第四个字符）的值
		System.out.println(d);
		String e=c.trim();//去除字符串中首尾的空格
		System.out.println(e);
		c=c.replaceAll(" ","");
		System.out.println(c);
	}
}
