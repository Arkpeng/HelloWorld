package Collections;

import java.util.ArrayList;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> people = new ArrayList<>();
		String a = "唐僧", b = "悟空", c = "八戒", d = "沙僧", e = "白龙马";
		people.add(a);
		people.add(b);
		people.add(c);
		people.set(1,e);  //将白龙马替换索引为1的值
		people.add(d);
		for(String al:people) {
			System.out.println(al);
		}
		System.out.println();
		
		people.add(1,e);   //将白龙马放入索引为1的位置，索引1后面的后移一位
		for(String al:people) {
			System.out.println(al);
		}
	}

}
