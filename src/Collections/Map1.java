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
		Student stu1 = new Student(1,"С��");
		Student stu2 = new Student(2,"С��");
		Student stu3 = new Student(3,"С��");
		Student stu4 = new Student(5,"С��");
		map.put(stu1.get_id(), stu1.getName());
		map.put(stu2.get_id(), stu2.getName());
		map.put(stu3.get_id(), stu3.getName());
		map.put(stu4.get_id(), stu4.getName());
		//ʹ��keySet()��ȡ���е�key,��ͨ��key�õ�value
		/*Set<Integer> set = map.keySet();    �õ�����key�ļ���
		Iterator<Integer> it =set.iterator();*/
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			System.out.println("_id:"+key+" "+"name:"+value);
		}
		System.out.println();
		//ʹ��entrySet()��������		
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
