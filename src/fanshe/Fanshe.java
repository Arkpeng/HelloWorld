package fanshe;

public class Fanshe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ�ַ�ʽ��ȡClass����
		Student s1 = new Student();
		Class stuClass = s1.getClass();
		System.out.println(stuClass.getName());
		//�ڶ��ַ�ʽ��ȡClass����
		Class stuClass2 = Student.class;
		System.out.println(stuClass2.getName());
		System.out.println(stuClass==stuClass2);
		//�����ַ�ʽ��ȡClass����
		try {
			Class stuClass3 = Class.forName("fanshe.Student");
			System.out.println(stuClass3==stuClass);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
