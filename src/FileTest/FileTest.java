package FileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("E:\\mywork", "IOTest.txt");
//		if (file.exists()) {
//			file.delete();
//			System.out.println("文件已经删除");
//		} else {
//			{
//				try {
//					file.createNewFile();
//					System.out.println("创建文件");
//				} catch (Exception e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
//			}
//		}
		
		System.out.println("文件名："+file.getName());
		System.out.println("文件长度："+file.length());
		System.out.println("该文件是否隐藏？"+file.isHidden());
	}

}
