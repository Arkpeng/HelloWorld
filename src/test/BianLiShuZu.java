package test;

public class BianLiShuZu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[] { "红", "橙", "黄", "绿", "青", "蓝", "紫" };
		int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		遍历数组并打印
		for (String a : array) {
			System.out.print(a + " ");
		}
		System.out.println();

		for (int b : array1) {
			System.out.print(b + " ");
		}

		System.out.println();

		// 打印数组中所有的元素
		int numArray[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5 } };
		for (int a[] : numArray) {
			for (int num : a) {
				System.out.print(num);
			}
			System.out.println();
		}

		System.out.println();

		int numb[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5 } };
		for (int i = 0; i < numb.length; i++) {
			for (int j = 0; j < numb[i].length; j++) {
				System.out.print(numb[i][j]);
			}
			System.out.println();
		}
		
		String arr[][] = new String[][] { {"红", "橙", "黄"}, {"绿", "青"},{ "蓝"},{ "紫"} };
			for(String[] a:arr) {
				for(String b:a) {
					System.out.print(b+" ");
				}
				System.out.println();
			}
	}		
}
