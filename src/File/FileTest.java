package File;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		String pathname = "E:\\";
		// TODO Auto-generated method stub
		File file = new File(pathname);
		String[] str = file.list();  //��ȡָ��Ŀ¼�µ������ļ����ļ��е���������
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println();
		File[] f = file.listFiles();  //��ȡָ��Ŀ¼�µ������ļ����ļ��е�File����
		for(File fl:f) {
			System.out.print(fl+" ");
		}
	}

}
