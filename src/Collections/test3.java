package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test3 {
	public static void main(String[] args) {
		List<String> phone = new ArrayList<>();
		phone.add("����");
		phone.add("ƻ��");
		phone.add("����");
		phone.add("С��");
		phone.add("��Ϊ");
		phone.add("����");
		for (String ph : phone) {
			System.out.println(ph);
		}
		System.out.println();
		phone = phone.subList(2, 4);  //����������Ϊ4��ֵ
		for(String iphone:phone) {
		System.out.println(iphone);
		}
	}
}
