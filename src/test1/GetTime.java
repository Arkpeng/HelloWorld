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
		System.out.println("月份简称：" + a);
		System.out.println("月份全称：" + b);
		System.out.println("星期简称：" + c);
		System.out.println("星期全称：" + d);
		System.out.println("2位的年份：" + e);
		System.out.println("4位的年份：" + f);
		System.out.println("2位的月份：" + g);
		System.out.println("2位的日期：" + h);
		System.out.println("1位的日期：" + i);
		System.out.println("2位24小时制的小时："+j);
		System.out.println("2位12小时制的小时："+k);
		System.out.println("24小时制的小时："+l);
		System.out.println("12小时制的小时是："+m);
		System.out.println("2位小时中的分钟："+n);
		System.out.println("2位分钟中的秒："+o);
		System.out.println("时区简称："+p);
		System.out.println("上午还是下午："+q);
		System.out.println("今天的日期是："+t);
		System.out.println("默认的时间格式是："+date);

	}

}
