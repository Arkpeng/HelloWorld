package File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReaderWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = "zhonghua����,158";
		int i = 98;
		char ch = 'a';
		String filePath = "b.txt";
		FileWriter fw = new FileWriter(filePath);
		fw.write(str);  //��������
		fw.write('\n');
		fw.write(ch);  
		fw.write('\n');
		fw.write(i+"");   //ֱ����i��Ϊ������д�����i��asc���Ӧ���ַ�
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("a.txt");
		int b;
		while((b=fr.read()) !=-1) {
			System.out.print((char) b);
		}
		fr.close();
	}

}
