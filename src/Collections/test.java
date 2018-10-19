package Collections;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> person = new ArrayList<>();
		person.add("jerry");
		person.add("tom");
		person.add("annie");
		person.add("joker");
		for(String a:person) {
			System.out.println(a);
		}
		System.out.println();
		
		person.remove(1);
		person.remove("annie");
		for(String a:person) {
			System.out.println(a);
		}
	}

}
