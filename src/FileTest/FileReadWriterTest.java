package FileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileReadWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File file = new File("E:\\mywork","RWTest.txt");
		FileWriter fw = new FileWriter(file);
		String s = "好好学习，天天向上。";
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		osw.write(s);
		osw.flush();
		osw.close();
		fos.close();
		fw.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
