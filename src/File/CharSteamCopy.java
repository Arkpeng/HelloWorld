package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharSteamCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("CharOld.txt");
		file.createNewFile();
		File file2 = new File("CharNew.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(file2);
			BufferedWriter bw = new BufferedWriter(fw);
			String s = null;
			int i = 0;
			while((s=br.readLine())!=null) {   //¶ÁÈ¡Êý¾Ý
				bw.write(s);
				System.out.println(s);
				bw.flush();
				bw.newLine();  //
			}
			br.close();
			fr.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
