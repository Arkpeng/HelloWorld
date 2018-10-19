package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp("001","张");
		Emp e2 = new Emp("002","李");
		Emp e3 = new Emp("003","王");
		Emp e4 = new Emp("004","周");
		Emp e5 = new Emp("005","钟");
		Emp e6 = new Emp("006","吴");
		Map<String, String> map = new HashMap<>();
		map.put(e1.getId(), e1.getName());
		map.put(e2.getId(), e2.getName());
		map.put(e3.getId(), e3.getName());
		map.put(e4.getId(), e4.getName());
		map.put(e5.getId(), e5.getName());
		map.put(e6.getId(), e6.getName());
		map.remove("005");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("id:"+key+" "+"name:"+value);
		}
//		Set<Map.Entry<String, String>> set = map.entrySet();
//		Iterator<Map.Entry<String , String>> it = set.iterator();
//		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			Map.Entry<String, String> entry = it.next();
//			System.out.println("id:"+entry.getKey()+" "+"name:"+entry.getValue());
		}
	}


