package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������϶���
		List<String> list = new ArrayList<>();
		//�����������Ԫ��
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		//ʹ�ü����еķ���iterator��ȡ��������ʵ�������ʹ��Iterator�ӿڽ��գ���̬��
		Iterator<String> it = list.iterator();
		while (it.hasNext()) { // �ж��Ƿ������һ��Ԫ��
			System.out.println(it.next());
		}

	}

}
