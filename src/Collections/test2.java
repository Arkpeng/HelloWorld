package Collections;

import java.util.ArrayList;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> people = new ArrayList<>();
		String a = "��ɮ", b = "���", c = "�˽�", d = "ɳɮ", e = "������";
		people.add(a);
		people.add(b);
		people.add(c);
		people.set(1,e);  //���������滻����Ϊ1��ֵ
		people.add(d);
		for(String al:people) {
			System.out.println(al);
		}
		System.out.println();
		
		people.add(1,e);   //���������������Ϊ1��λ�ã�����1����ĺ���һλ
		for(String al:people) {
			System.out.println(al);
		}
	}

}
