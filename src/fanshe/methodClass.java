package fanshe;

import java.lang.reflect.Method;

public class methodClass {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Class cs = Class.forName("fanshe.Student");
		
		System.out.println("***********获取所有的公有方法************");
		Method[] methodArray = cs.getMethods();
		for(Method a:methodArray) {
			System.out.println(a);
		}
		
		System.out.println("*****************获取所有的方法*******************");
		methodArray = cs.getDeclaredMethods();
		for(Method a:methodArray) {
			System.out.println(a);
		}
		
		System.out.println("******************获取show1()方法******************");
		Method m = cs.getMethod("show1", String.class);
		System.out.println(m);
	}

}
