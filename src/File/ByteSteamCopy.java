package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteSteamCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			File file = new File("ByteOld.txt");
			file.createNewFile();
			File file2 = new File("ByteNew.txt");
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(file2);
			int len = 0;
			byte[] bytes = new byte[(int) file.length()];
			while ((len = fis.read(bytes)) != -1) {
				fos.write(bytes);
				System.out.println(new String(bytes, 0, len));
				fos.flush();
			}
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
