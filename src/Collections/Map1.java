package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		Student stu1 = new Student(1,"小赵");
		Student stu2 = new Student(2,"小王");
		Student stu3 = new Student(3,"小李");
		Student stu4 = new Student(5,"小周");
		map.put(stu1.get_id(), stu1.getName());
		map.put(stu2.get_id(), stu2.getName());
		map.put(stu3.get_id(), stu3.getName());
		map.put(stu4.get_id(), stu4.getName());
		//使用keySet()获取所有的key,再通过key得到value
		/*Set<Integer> set = map.keySet();    得到所有key的集合
		Iterator<Integer> it =set.iterator();*/
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			System.out.println("_id:"+key+" "+"name:"+value);
		}
		System.out.println();
		//使用entrySet()遍历集合		
		/*Set<Map.Entry<Integer, String>> entry = map.entrySet();
		Iterator<Map.Entry<Integer, String>> ite = entry.iterator();*/
		Iterator<Map.Entry<Integer, String>> ite = map.entrySet().iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer , String> en = ite.next();
			Integer key = en.getKey();
			String value = en.getValue();
			System.out.println("_id:"+key+" "+"name:"+value);
		}
		System.out.println();
		
		//
		for(Map.Entry<Integer, String> entr:map.entrySet()) {
			System.out.println("_id:"+entr.getKey()+" "+"name:"+entr.getValue());
		}

	}

}
