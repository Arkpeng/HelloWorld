package FileTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("E:\\mywork","BufIO.txt");
			String str = new String("abcd°¢·¿¹¬");
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			byte[] b=new byte[(int)file.length()];
			b=str.getBytes("UTF-8");
			bos.write(b);
			bos.flush();
			bos.close();
			fos.close();
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i;
			while((i=bis.read(b))!=-1) {
				String st= new String(b,"UTF-8");
				System.out.println(st);
			}
			bis.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
