package fanshe;

import java.lang.reflect.Method;

public class methodClass {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Class cs = Class.forName("fanshe.Student");
		
		System.out.println("***********��ȡ���еĹ��з���************");
		Method[] methodArray = cs.getMethods();
		for(Method a:methodArray) {
			System.out.println(a);
		}
		
		System.out.println("*****************��ȡ���еķ���*******************");
		methodArray = cs.getDeclaredMethods();
		for(Method a:methodArray) {
			System.out.println(a);
		}
		
		System.out.println("******************��ȡshow1()����******************");
		Method m = cs.getMethod("show1", String.class);
		System.out.println(m);
	}

}
