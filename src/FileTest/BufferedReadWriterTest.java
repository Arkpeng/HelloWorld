package FileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReadWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("E:\\Mywork", "BufRW.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			String str = new String("abcÖÐ¹ú123");
			bw.write(str);
			bw.flush();
			bw.close();
			fw.close();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			int i = 0;
			while ((i = br.read()) != -1) {
				System.out.print((char)i);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
