package File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReaderWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = "zhonghua任命,158";
		int i = 98;
		char ch = 'a';
		String filePath = "b.txt";
		FileWriter fw = new FileWriter(filePath);
		fw.write(str);  //中文乱码
		fw.write('\n');
		fw.write(ch);  
		fw.write('\n');
		fw.write(i+"");   //直接用i作为参数，写入的是i按ascⅡ对应的字符
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
