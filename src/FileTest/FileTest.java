package FileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("E:\\mywork", "IOTest.txt");
//		if (file.exists()) {
//			file.delete();
//			System.out.println("�ļ��Ѿ�ɾ��");
//		} else {
//			{
//				try {
//					file.createNewFile();
//					System.out.println("�����ļ�");
//				} catch (Exception e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
//			}
//		}
		
		System.out.println("�ļ�����"+file.getName());
		System.out.println("�ļ����ȣ�"+file.length());
		System.out.println("���ļ��Ƿ����أ�"+file.isHidden());
	}

}
