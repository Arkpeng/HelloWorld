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
		d=c.charAt(3);  //��ȡ�ַ������±�Ϊ3�����ĸ��ַ�����ֵ
		System.out.println(d);
		String e=c.trim();//ȥ���ַ�������β�Ŀո�
		System.out.println(e);
		c=c.replaceAll(" ","");
		System.out.println(c);
	}
}
