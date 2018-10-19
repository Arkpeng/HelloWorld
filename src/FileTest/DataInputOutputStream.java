package FileTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("E:\\mywork","DataIO.txt");
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			String str = new String("abc÷’”⁄123");
//			byte[] b = new byte[(int)file.length()];
//			b = str.getBytes("UTF-8");
			dos.write(str.getBytes());
			dos.close();
			fos.close();
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
				String s = dis.readUTF();
				System.out.print(s);
			
			dis.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
