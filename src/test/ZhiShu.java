package test;

public class ZhiShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("100���ڵ�������");

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
		
		System.out.print("100���ڵ�������");
		for (int i = 2; i <= 100; i++) { // ȡ�ô�2-100��������
			for (int j = 2; j <= i; j++) { // ����
				if (i % j == 0 && i != j) { // �ų�
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
