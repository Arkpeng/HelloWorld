package test;

public class ZhiShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("100以内的质数：");

		for (int i = 2; i <= 100; i++) {
			int j = 2;
			while (j < i) {
				if (i % j == 0) {
					break;
				}
				j++;
			}
			if (i == j) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.print("100以内的质数：");
		for (int i = 2; i <= 100; i++) { // 取得从2-100的整数数
			for (int j = 2; j <= i; j++) { // 除数
				if (i % j == 0 && i != j) { // 排除
					break;
				}
				if (i % j == 0 && i == j) {
					System.out.print(i + " ");
				}
			}
			;
		}
	}
}
