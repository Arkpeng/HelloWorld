package test;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 9, 7, 6, 1, 2, 8, 4, 3, 5, 0 };
		int temp;
		int size=arr.length;
		System.out.println("原数组：");
		for(int a:arr) {
			System.out.print(a+"\t");
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	    
		System.out.println();
		System.out.println("新数组");
		for(int a:arr) {
			System.out.print(a+"\t");
		}
	}

}
