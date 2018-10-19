package test1;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abc def ghi jkl mmo pqr st uvw xyz");
		String[] news = s.split(" ");
		System.out.println("按分割字符分割后的字符串是：");
//		for (int i = 0; i < news.length; i++) {
//			System.out.println(news[i]);
//		}
		for (String a : news) {
			System.out.println(a);
		}

		String[] news1 = s.split(" ", 5);
		System.out.println("按分割字符分割五次后的字符串是：");
//		for (int i = 0; i < news1.length; i++) {
//			System.out.println(news1[i]);
//		}

		for (String b : news1) {
			System.out.println(b);
		}

		String s1 = "无言独上西楼，月如钩，寂寞梧桐深院锁清秋。" + "剪不断、理还乱、是离愁，别是一般滋味在心头。";
		System.out.println("字符串长度为：" + s1.length());
		String[] new2 = s1.split("，|。");
		for (String c : new2) {
			System.out.println(c);
		}
		System.out.println();
		System.out.println("分行后的字符串长度为" + new2.length);
	}

}
