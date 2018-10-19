package test1;

public class Opinion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("i am a student");
		String s2 = new String("i am a student");
		String s3 = new String("I AM A STUDENT");
		String s4 = s1;
		boolean b1 = (s1 == s2);
		boolean b2 = (s1 == s4);
		boolean b3 = s1.equals(s2);
		boolean b4 = s2.equals(s3);
		boolean b5 = s1.equalsIgnoreCase(s2);
		boolean b6 = s2.equalsIgnoreCase(s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
	}
}
