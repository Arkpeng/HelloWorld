package test;

public class ZhiJiaoSanJiaoXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++) {
			for(int x=1;x<-i+5;x++) {
				System.out.print(" ");
			}
			
			for(int y=1;y<i+1;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
