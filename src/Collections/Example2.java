package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "A", b = "a", c = "c", d = "C", e = "a";
//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
//		Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		System.out.println(list);	
		System.out.println(set);
		Iterator<String> it = list.iterator();
		Iterator<String> ite = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		while(ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}
	}

}
