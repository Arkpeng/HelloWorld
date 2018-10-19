package fanshe;

public class Student {
	public String name;
	protected int age;
	char sex;
	private int phone;
	
	public String toString() {
		return "学生[姓名："+name+" 年龄"+age+" 性别"+sex+" 电话:"+phone+"]";
	}
	//公有、无参的构造方法
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.print("调用了无参的构造方法");
	}
	//默认的构造方法
	Student(String str){
		System.out.println("默认的构造方法s="+str);
	}
	//有一个参数的构造方法
	public Student(char name) {
		System.out.println("姓名："+name);
	}
	//有多个参数的构造方法
	public Student(String name,int age) {
		System.out.print("姓名："+name+" ,年龄:"+age);
	}
	
	//受保护的构造方法
	protected Student(boolean n) {
		System.out.println("受保护的构造方法n="+n);
	}
	//私有构造方法
	private Student(int age) {
		System.out.println("私有的构造方法  年龄："+age);
	}
	
	public void show1(String s) {
		System.out.println("调用了公有的、无参的成员方法");
	}
	
	protected void show2() {
		System.out.println("调用了受保护的、无参的成员方法");
	}
	
	void show3() {
		System.out.println("调用了默认的、无参的成员方法");
	}
	
	private String show4(int age) {
		System.out.println("调用了私有的、有返回值的、有参数的成员方法");
		return "abcdefg";
	}
	
}
