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
		Person p = new Person() {     //继承接口
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃东西");
			}
		};
		p.eat();
		
		Animal a = new Animal() {    //继承抽象类（父类）
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃吃吃");
			}
		};
		a.eat();
	}

}
