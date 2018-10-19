package File;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("a.txt");
		file.createNewFile();
		System.out.println("1."+file.exists());  //1.判断文件是否存在
		System.out.println("2."+file.getName());  //2.获取文件的名字
		System.out.println("3."+file.getAbsolutePath());  //3.获取文件的绝对路径
		System.out.println("4."+file.getPath());  //4.获取文件的相对路径
		System.out.println("5."+file.getParent());  //5.获取文件的父路径
		System.out.println("6."+file.canRead());  //6.文件是否可读
		System.out.println("7."+file.canWrite());  //7.文件是否可写
		System.out.println("8."+file.length());  //8.获取文件的长度
		System.out.println("9."+file.lastModified());  //9.文件最后一次修改的时间
		System.out.println("10."+file.isDirectory());  //10.判断文件是否是一个目录
		System.out.println("11."+file.isHidden());  //11.判断文件是否隐藏
		System.out.println("12."+file.isFile());  //12.判断文件是否存在
		File file2 = new File("b.txt");
		/*if(file2.exists()&&file2.isFile()) {
			if(file2.delete()) {
				System.out.println("删除成功");
			}else {
				System.out.println("删除失败");
			}		
			}else {
				System.out.println("文件不存在");
		}*/
		file.renameTo(file2);
	}

}
