package Class;

public class Son extends Father{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.say();
		s.cry();
		s.run();
		System.out.println();
		Father f = new Son();
		f.say();
		f.cry();
//		f.run();		
		System.out.println();
		Son son = (Son) f;
		son.say();
		son.cry();
		son.run();
	}
	public void say() {
		System.out.println("say");
	}
	public void cry() {
		System.out.println("cry");
	}
	public void run() {
		System.out.println("Εά");
	}
}
