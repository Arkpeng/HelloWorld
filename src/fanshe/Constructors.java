package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Constructors {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//加载class对象
		Class cs = Class.forName("fanshe.Student");
		//获取所有公有构造方法
		System.out.println("************公有构造方法************");
		Constructor[] conArray = cs.getConstructors();
		for(Constructor a:conArray) {
			System.out.println(a);
		}
		//获取所有的构造方法
		System.out.println("*************所有构造方法**************");
		conArray = cs.getDeclaredConstructors();
		for(Constructor a:conArray) {
			System.out.println(a);
		}
		
		//获取公有、无参的构造方法
		System.out.println("*****************无参的构造方法***************");
		try {
			Constructor con = cs.getConstructor(null);
			System.out.println(con);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//获取私有构造方法
		System.out.println("********************私有的构造方法*****************");
		Constructor con = cs.getDeclaredConstructor(char.class);
		Constructor con1 = cs.getDeclaredConstructor(int.class);
		System.out.println(con);
		System.out.println(con1);
		con1.setAccessible(true);
		con1.newInstance(22);
		con.setAccessible(true);
		con.newInstance('男');
	}

}
