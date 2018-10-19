package fanshe;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
public class fieldClass {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException{
		// TODO Auto-generated method stub
		Class cs = Class.forName("fanshe.Student");
		
		System.out.println("*******************获取所有公有的字段******************");
		Field[] fieldArray = cs.getFields();
		for(Field a:fieldArray) {
			System.out.println(a);
		}
		
		System.out.println("*********************获取所有的字段*********************");
		fieldArray = cs.getDeclaredFields();
		for(Field a:fieldArray) {
			System.out.println(a);
		}
		
		System.out.println("*******************获取私有字段并调用**********************");
		Field f = cs.getDeclaredField("phone");
		System.out.println(f);
		Object obj = cs.getConstructor().newInstance();
		f.setAccessible(true);
		f.set(obj, 12306);
		Student stu = (Student) obj;
		System.out.println("验证电话："+stu);
	}

}
