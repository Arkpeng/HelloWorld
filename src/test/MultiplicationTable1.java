package test;

public class MultiplicationTable1 {
	public static void main(String[] args) {
		int sum = 0;
		String lab = "������1~100�ĺͣ�";
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum > 1000) {
				lab = "��1��" + i + "֮�����������ĺ��ǣ�";
				break;
			}
		}
		System.out.println(lab + sum);
	}
}
