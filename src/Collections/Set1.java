package Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> test = new TreeSet<>();
		test.add(1);
		test.add(2);
		test.add(3);
		System.out.println(test);
		System.out.println();

		Iterator<Integer> it = test.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(test.size());
	}

}
