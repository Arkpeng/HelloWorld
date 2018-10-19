package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ShowBufferedStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] str= {"abc","ss","520"};
		File file = new File("c.txt"); //创建文件对象
		try{
			FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<str.length;i++) {
			bw.write(str[i]);
			bw.newLine();
		}
		bw.close();
		fw.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			int j = 0;
			while((s=br.readLine())!=null) {
				j++;
				System.out.println("第"+j+"行："+s);
			}
			br.close();
			fr.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
