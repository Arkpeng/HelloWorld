package File;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		String pathname = "E:\\";
		// TODO Auto-generated method stub
		File file = new File(pathname);
		String[] str = file.list();  //获取指定目录下的所有文件和文件夹的名称数组
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println();
		File[] f = file.listFiles();  //获取指定目录下的所有文件和文件夹的File数组
		for(File fl:f) {
			System.out.print(fl+" ");
		}
	}

}
