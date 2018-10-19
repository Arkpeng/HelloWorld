package test;

public class ShuZu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][4];
		System.out.println("三行四列的数组：");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
