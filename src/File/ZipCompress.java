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
		System.out.println("ѹ����...");
		
		FileOutputStream fos = new FileOutputStream(zipFile);
		
		//����zip�����
		ZipOutputStream zos = new ZipOutputStream(fos);
		
		//�������������
		BufferedOutputStream bos= new BufferedOutputStream(zos);
		File sourceFile = new File(sourceFileName); 
		
		//���ú���
		compress(zos,bos,sourceFile,sourceFile.getName());
		
		bos.close();
		zos.close();
		fos.close();
	}
	
	private void compress(ZipOutputStream zos, BufferedOutputStream bos, File sourceFile, String base) throws IOException {
		// TODO Auto-generated method stub
		//���·��ΪĿ¼���ļ��У�
		if(sourceFile.isDirectory()) {
			//ȥ���ļ����е��ļ������ļ���
			File[] flist = sourceFile.listFiles();
			
			if(flist.length==0) {  //����ļ���Ϊ�գ���ֻ����Ŀ�ĵ�zip�ļ���д��һ��Ŀ¼�����
				System.out.println(base+"/");
				zos.putNextEntry(new ZipEntry(base+"/"));
			}else {
				//����ļ��в�Ϊ�գ���ݹ����compress���ļ����е�ÿһ���ļ������ļ��У�����ѹ��
				for(int i=0;i<flist.length;i++) {
					compress(zos, bos, flist[i], base+"/"+flist[i].getName());
				}
			}
		}else {
			//�������Ŀ¼���ļ��У�����Ϊ�ļ�������д��Ŀ¼����㣬֮���ļ�д��zip�ļ���
			zos.putNextEntry(new ZipEntry(base));
			FileInputStream fos = new FileInputStream(sourceFile);
			BufferedInputStream bis = new BufferedInputStream(fos);
			
			int tag;
			System.out.println(base);
			//��Դ�ļ�д�뵽zip�ļ���
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
			System.out.println("ѹ���ɹ�");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
