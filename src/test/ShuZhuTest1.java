package test;

public class ShuZhuTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 3, 5, 7, 9 };
		int max = arr[0];
		System.out.println("�����ֵΪ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("����������ֵΪ��");
		System.out.println(max);
	}

}
