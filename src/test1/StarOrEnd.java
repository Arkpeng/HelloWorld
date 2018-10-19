package test1;

public class StarOrEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "123456";
		String num2 = "23456";
		boolean b1 = num1.startsWith("123");
		boolean b2 = num2.startsWith("123");
		boolean b3 = num1.endsWith("45");
		boolean b4 = num2.endsWith("456");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}

}
