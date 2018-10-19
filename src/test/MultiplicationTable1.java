package test;

public class MultiplicationTable1 {
	public static void main(String[] args) {
		int sum = 0;
		String lab = "请输入1~100的和：";
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum > 1000) {
				lab = "从1到" + i + "之间连续整数的和是：";
				break;
			}
		}
		System.out.println(lab + sum);
	}
}
