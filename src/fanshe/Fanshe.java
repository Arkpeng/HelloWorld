package fanshe;

public class Fanshe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第一种方式获取Class对象
		Student s1 = new Student();
		Class stuClass = s1.getClass();
		System.out.println(stuClass.getName());
		//第二种方式获取Class对象
		Class stuClass2 = Student.class;
		System.out.println(stuClass2.getName());
		System.out.println(stuClass==stuClass2);
		//第三种方式获取Class对象
		try {
			Class stuClass3 = Class.forName("fanshe.Student");
			System.out.println(stuClass3==stuClass);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
