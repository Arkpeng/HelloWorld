package fanshe;

public class Student {
	public String name;
	protected int age;
	char sex;
	private int phone;
	
	public String toString() {
		return "ѧ��[������"+name+" ����"+age+" �Ա�"+sex+" �绰:"+phone+"]";
	}
	//���С��޲εĹ��췽��
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.print("�������޲εĹ��췽��");
	}
	//Ĭ�ϵĹ��췽��
	Student(String str){
		System.out.println("Ĭ�ϵĹ��췽��s="+str);
	}
	//��һ�������Ĺ��췽��
	public Student(char name) {
		System.out.println("������"+name);
	}
	//�ж�������Ĺ��췽��
	public Student(String name,int age) {
		System.out.print("������"+name+" ,����:"+age);
	}
	
	//�ܱ����Ĺ��췽��
	protected Student(boolean n) {
		System.out.println("�ܱ����Ĺ��췽��n="+n);
	}
	//˽�й��췽��
	private Student(int age) {
		System.out.println("˽�еĹ��췽��  ���䣺"+age);
	}
	
	public void show1(String s) {
		System.out.println("�����˹��еġ��޲εĳ�Ա����");
	}
	
	protected void show2() {
		System.out.println("�������ܱ����ġ��޲εĳ�Ա����");
	}
	
	void show3() {
		System.out.println("������Ĭ�ϵġ��޲εĳ�Ա����");
	}
	
	private String show4(int age) {
		System.out.println("������˽�еġ��з���ֵ�ġ��в����ĳ�Ա����");
		return "abcdefg";
	}
	
}
