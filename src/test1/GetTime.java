package test1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GetTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String t = sdf.format(date);
		String a = String.format(Locale.US, "%tb", date);
		String b = String.format(Locale.US, "%tB", date);
		String c = String.format(Locale.US, "%ta", date);
		String d = String.format(Locale.US, "%tA", date);
		String e = String.format("%ty", date);
		String f = String.format("%tY", date);
		String g = String.format("%tm", date);
		String h = String.format("%td", date);
		String i = String.format("%te", date);
		String j = String.format("%tH", date);
		String k = String.format("%tI", date);
		String l = String.format("%tk", date);
		String m = String.format("%tl", date);
		String n = String.format("%tM", date);
		String o = String.format("%tS", date);
		String p = String.format("%tZ", date);
		String q = String.format("%tp", date);		
		System.out.println("�·ݼ�ƣ�" + a);
		System.out.println("�·�ȫ�ƣ�" + b);
		System.out.println("���ڼ�ƣ�" + c);
		System.out.println("����ȫ�ƣ�" + d);
		System.out.println("2λ����ݣ�" + e);
		System.out.println("4λ����ݣ�" + f);
		System.out.println("2λ���·ݣ�" + g);
		System.out.println("2λ�����ڣ�" + h);
		System.out.println("1λ�����ڣ�" + i);
		System.out.println("2λ24Сʱ�Ƶ�Сʱ��"+j);
		System.out.println("2λ12Сʱ�Ƶ�Сʱ��"+k);
		System.out.println("24Сʱ�Ƶ�Сʱ��"+l);
		System.out.println("12Сʱ�Ƶ�Сʱ�ǣ�"+m);
		System.out.println("2λСʱ�еķ��ӣ�"+n);
		System.out.println("2λ�����е��룺"+o);
		System.out.println("ʱ����ƣ�"+p);
		System.out.println("���绹�����磺"+q);
		System.out.println("����������ǣ�"+t);
		System.out.println("Ĭ�ϵ�ʱ���ʽ�ǣ�"+date);

	}

}
