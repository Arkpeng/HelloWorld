package test1;

public class checkNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123456";
		if (checkNumber.isNumber(s)) {
			System.out.println(s + "是数字格式");
		} else {
			System.out.println(s + "不是数字格式");
		}
		;

	}

	private static boolean isNumber(String s) {
		// TODO Auto-generated method stub
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (Character.isDigit(a[i])) {
			} else {
				return false;
			}
		}
		return true;
	}

}
