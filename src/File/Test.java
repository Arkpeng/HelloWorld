package File;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("a.txt");
		file.createNewFile();
		System.out.println("1."+file.exists());  //1.�ж��ļ��Ƿ����
		System.out.println("2."+file.getName());  //2.��ȡ�ļ�������
		System.out.println("3."+file.getAbsolutePath());  //3.��ȡ�ļ��ľ���·��
		System.out.println("4."+file.getPath());  //4.��ȡ�ļ������·��
		System.out.println("5."+file.getParent());  //5.��ȡ�ļ��ĸ�·��
		System.out.println("6."+file.canRead());  //6.�ļ��Ƿ�ɶ�
		System.out.println("7."+file.canWrite());  //7.�ļ��Ƿ��д
		System.out.println("8."+file.length());  //8.��ȡ�ļ��ĳ���
		System.out.println("9."+file.lastModified());  //9.�ļ����һ���޸ĵ�ʱ��
		System.out.println("10."+file.isDirectory());  //10.�ж��ļ��Ƿ���һ��Ŀ¼
		System.out.println("11."+file.isHidden());  //11.�ж��ļ��Ƿ�����
		System.out.println("12."+file.isFile());  //12.�ж��ļ��Ƿ����
		File file2 = new File("b.txt");
		/*if(file2.exists()&&file2.isFile()) {
			if(file2.delete()) {
				System.out.println("ɾ���ɹ�");
			}else {
				System.out.println("ɾ��ʧ��");
			}		
			}else {
				System.out.println("�ļ�������");
		}*/
		file.renameTo(file2);
	}

}
