package File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.print.attribute.standard.Compression;

public class ZipCompress {
	private String zipFileName;
	private String sourceFileName;
	
	public ZipCompress(String zipFileName,String sourceFileName) {
		this.zipFileName = zipFileName;
		this.sourceFileName = sourceFileName;
	}
	
	public void zip() throws IOException {
		File zipFile = new File(zipFileName);
		System.out.println("压缩中...");
		
		FileOutputStream fos = new FileOutputStream(zipFile);
		
		//创建zip输出流
		ZipOutputStream zos = new ZipOutputStream(fos);
		
		//创建缓冲输出流
		BufferedOutputStream bos= new BufferedOutputStream(zos);
		File sourceFile = new File(sourceFileName); 
		
		//调用函数
		compress(zos,bos,sourceFile,sourceFile.getName());
		
		bos.close();
		zos.close();
		fos.close();
	}
	
	private void compress(ZipOutputStream zos, BufferedOutputStream bos, File sourceFile, String base) throws IOException {
		// TODO Auto-generated method stub
		//如果路径为目录（文件夹）
		if(sourceFile.isDirectory()) {
			//去除文件夹中的文件或子文件夹
			File[] flist = sourceFile.listFiles();
			
			if(flist.length==0) {  //如果文件夹为空，则只需在目的地zip文件中写入一个目录进入点
				System.out.println(base+"/");
				zos.putNextEntry(new ZipEntry(base+"/"));
			}else {
				//如果文件夹不为空，则递归调用compress，文件夹中的每一个文件（或文件夹）进行压缩
				for(int i=0;i<flist.length;i++) {
					compress(zos, bos, flist[i], base+"/"+flist[i].getName());
				}
			}
		}else {
			//如果不是目录（文件夹），即为文件，则先写入目录进入点，之后将文件写入zip文件中
			zos.putNextEntry(new ZipEntry(base));
			FileInputStream fos = new FileInputStream(sourceFile);
			BufferedInputStream bis = new BufferedInputStream(fos);
			
			int tag;
			System.out.println(base);
			//将源文件写入到zip文件中
			while((tag=bis.read())!=-1) {
				bos.write(tag);
			}
			bos.close();
			bis.close();
			fos.close();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZipCompress zipcom = new ZipCompress("zipTest.zip", "a.txt");
		try {
			zipcom.zip();
			System.out.println("压缩成功");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
