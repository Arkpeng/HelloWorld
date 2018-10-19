package File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Decompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileAdress = "E:\\eclipse-workspace\\test\\zipTest\\b.zip";
		String upZipAdress = "E:\\eclipse-workspace\\test\\zipTest\\";
		Decompress(fileAdress, "GBK", upZipAdress);
		File file = new File(fileAdress);
		ZipFile zipFile = null;
	}	

	private static void Decompress(String fileAdress, String charset, String upZipAdress) {
		// TODO Auto-generated method stub
		try {
			//输入源zip路径
			ZipInputStream zis = new ZipInputStream(new FileInputStream(fileAdress),Charset.forName(charset));  
			BufferedInputStream bis = new BufferedInputStream(zis);
			String outPath = upZipAdress;
			File fOut = null;
			ZipEntry entry;
			try {
				while((entry=zis.getNextEntry())!=null&&!entry.isDirectory()) {
					fOut = new File(outPath,entry.getName());
					if(!fOut.exists()) {
						(new File(fOut.getParent())).mkdirs();
					}
					FileOutputStream fos = new FileOutputStream(fOut);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					int b;
					while((b=bis.read())!=-1) {
						bos.write(b);
					}
					bos.close();
					fos.close();
					System.out.println("解压成功");
				}
				bis.close();
				zis.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
