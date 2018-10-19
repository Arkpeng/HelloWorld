package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=100;i++) {
			list.add(i);
		}
		list.remove(10);
		for(Integer li:list) {
			System.out.println(li);
		}
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
