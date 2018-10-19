package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合对象
		List<String> list = new ArrayList<>();
		//往集合中添加元素
		list.add("红");
		list.add("橙");
		list.add("黄");
		list.add("绿");
		list.add("青");
		list.add("蓝");
		list.add("紫");
		//使用集合中的方法iterator获取迭代器的实现类对象，使用Iterator接口接收（多态）
		Iterator<String> it = list.iterator();
		while (it.hasNext()) { // 判断是否存在下一个元素
			System.out.println(it.next());
		}

	}

}
