package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <5; i++) {
			for (int x = 0; x < -i + 4; x++) { 
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * i + 1; j++) {
				if (i == 0) {
					System.out.print("*");
				} else if (j == 0 || j == 2 * i ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

		for (int i = 0; i <= 4; i++) {
			for (int x = 0; x < i+1 ; x++) {
				System.out.print(" ");
			}

			for (int j = 0; j < -2 * i + 7; j++) {
				if (j == 0 || j == -2*i+6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	}
