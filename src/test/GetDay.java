package test;

public class GetDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < day.length - 1; i++) {
			System.out.print((i + 1) + "����" + day[i] + "��" + "\t");
		}
		System.out.println();

		int a[][]= {{1,2,0},{4,5,10},{3,5}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//foreach��������
		for(int[] x:a) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}	
}
