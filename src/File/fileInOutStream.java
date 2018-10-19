package File;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileInOutStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int len;
		File file = new File("a.txt");
		FileInputStream fis = new FileInputStream(file);  //建立数据通道
		byte[] buf = new byte[(int) file.length()];  //建立缓存数组
		while((len = fis.read(buf))!=-1) {
			String str = new String(buf, 0, len);
			System.out.print(new String(buf,0,len));
		}
		FileOutputStream fos = new FileOutputStream("b.txt",true);		
			String st = "hello";
			fos.write(st.getBytes());   //将字符串转换为byte数组并写入文件
			fos.write(st.getBytes(), 0, 3);  
		
		fis.close();
		fos.close();
		
	}
}
