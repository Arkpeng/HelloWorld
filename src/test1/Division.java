package test1;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abc def ghi jkl mmo pqr st uvw xyz");
		String[] news = s.split(" ");
		System.out.println("���ָ��ַ��ָ����ַ����ǣ�");
//		for (int i = 0; i < news.length; i++) {
//			System.out.println(news[i]);
//		}
		for (String a : news) {
			System.out.println(a);
		}

		String[] news1 = s.split(" ", 5);
		System.out.println("���ָ��ַ��ָ���κ���ַ����ǣ�");
//		for (int i = 0; i < news1.length; i++) {
//			System.out.println(news1[i]);
//		}

		for (String b : news1) {
			System.out.println(b);
		}

		String s1 = "���Զ�����¥�����繳����į��ͩ��Ժ�����" + "�����ϡ����ҡ���������һ����ζ����ͷ��";
		System.out.println("�ַ�������Ϊ��" + s1.length());
		String[] new2 = s1.split("��|��");
		for (String c : new2) {
			System.out.println(c);
		}
		System.out.println();
		System.out.println("���к���ַ�������Ϊ" + new2.length);
	}

}
