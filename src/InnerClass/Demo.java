package InnerClass;


interface Person {
	public void eat();
}
abstract class Animal{
	public abstract void eat();
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person() {     //�̳нӿ�
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("�Զ���");
			}
		};
		p.eat();
		
		Animal a = new Animal() {    //�̳г����ࣨ���ࣩ
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("�ԳԳ�");
			}
		};
		a.eat();
	}

}
