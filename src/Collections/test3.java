package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test3 {
	public static void main(String[] args) {
		List<String> phone = new ArrayList<>();
		phone.add("三星");
		phone.add("苹果");
		phone.add("锤子");
		phone.add("小米");
		phone.add("华为");
		phone.add("魅族");
		for (String ph : phone) {
			System.out.println(ph);
		}
		System.out.println();
		phone = phone.subList(2, 4);  //不包含索引为4的值
		for(String iphone:phone) {
		System.out.println(iphone);
		}
	}
}
