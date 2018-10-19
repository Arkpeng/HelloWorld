package test;

public class LengXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i<5; i++) {
			for (int x = 0; x <-i+4; x++) { //´òÓ¡¿Õ¸ñ
				System.out.print(" ");
			}
			for (int y = 0; y <2*i+1; y++) { //´òÓ¡ÐÇÐÇ
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<4;i++) {
			for(int x=0;x<i+1;x++) {
				System.out.print(" ");
			}
			
			for(int y=0;y<-2*i+7;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
