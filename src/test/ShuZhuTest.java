package test;

public class ShuZhuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[][] {{1,3},{5,7,9},{6,3,8,4},{1}};
		for(int x[]:arr) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
