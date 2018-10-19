package InnerClass;

public class localInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass ou = new OutClass();
		ou.show();
		
	}
}

class OutClass{
	private int num1 = 1;
	private static int num2 = 2;
	private int num5 = 5;
	public void show() {
		int num3 = 3;
		class InnerClass{
			private int num4 = 4;
			private int num1 = 10;
			public void showInner() {
				System.out.println(num1);
				System.out.println(OutClass.this.num1);
				System.out.println(num2);
				System.out.println(num3);
				System.out.println(num4);
				System.out.println(num5);
			}
		}
		InnerClass in = new InnerClass();
		in.showInner();
	}
}