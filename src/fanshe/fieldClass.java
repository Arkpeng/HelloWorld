package fanshe;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
public class fieldClass {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException{
		// TODO Auto-generated method stub
		Class cs = Class.forName("fanshe.Student");
		
		System.out.println("*******************��ȡ���й��е��ֶ�******************");
		Field[] fieldArray = cs.getFields();
		for(Field a:fieldArray) {
			System.out.println(a);
		}
		
		System.out.println("*********************��ȡ���е��ֶ�*********************");
		fieldArray = cs.getDeclaredFields();
		for(Field a:fieldArray) {
			System.out.println(a);
		}
		
		System.out.println("*******************��ȡ˽���ֶβ�����**********************");
		Field f = cs.getDeclaredField("phone");
		System.out.println(f);
		Object obj = cs.getConstructor().newInstance();
		f.setAccessible(true);
		f.set(obj, 12306);
		Student stu = (Student) obj;
		System.out.println("��֤�绰��"+stu);
	}

}
