package test;

public class JinZiTa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			for (int x = 0; x < -i + 10; x++) {
				System.out.print(" ");
			}

			for (int y = 0; y < i + 1; y++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
