package test1;

import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String a = String.format("%tY", date);
		String b = String.format("%tm", date);
		String c = String.format("%te", date);
		String d = String.format("%tF", date);
		System.out.println("ΩÒÃÏ «£∫"+d);
	}

}
