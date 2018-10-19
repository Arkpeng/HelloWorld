package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Constructors {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//����class����
		Class cs = Class.forName("fanshe.Student");
		//��ȡ���й��й��췽��
		System.out.println("************���й��췽��************");
		Constructor[] conArray = cs.getConstructors();
		for(Constructor a:conArray) {
			System.out.println(a);
		}
		//��ȡ���еĹ��췽��
		System.out.println("*************���й��췽��**************");
		conArray = cs.getDeclaredConstructors();
		for(Constructor a:conArray) {
			System.out.println(a);
		}
		
		//��ȡ���С��޲εĹ��췽��
		System.out.println("*****************�޲εĹ��췽��***************");
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
		//��ȡ˽�й��췽��
		System.out.println("********************˽�еĹ��췽��*****************");
		Constructor con = cs.getDeclaredConstructor(char.class);
		Constructor con1 = cs.getDeclaredConstructor(int.class);
		System.out.println(con);
		System.out.println(con1);
		con1.setAccessible(true);
		con1.newInstance(22);
		con.setAccessible(true);
		con.newInstance('��');
	}

}
