package test;

public class insertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 9, 7, 6, 1, 2, 8, 4, 3, 5, 0 };
		int temp;
		int j;
		int size=arr.length;
		System.out.println("原数组：");
		for (int a : arr) {
			System.out.print(a + "\t");
		}
		
//		for(int i=1;i<size;i++) {  //排序的次数
//			temp = arr[i];
//
//			for(j=i;j>0&&arr[j-1]>temp;j--) {
//				arr[j]=arr[j-1];
//			}
//			arr[j]=temp;
//		}
		
		for(int i = 1; i < size;i++){//排序的趟数
            temp = arr[i];//赋给temp是为了防止索引i之前的元素向后移动覆盖了索引i的元素
            for(j=i-1; j>=0&&arr[j]>temp; j--) {//将大于i位置元素的元素向后移
                arr[j+1] = arr[j];
            }
            arr[j+1]= temp;//找到i应该在的位置，将值放置此处 
        }
		
		System.out.println();
		System.out.println("新数组");
		for (int a : arr) {
			System.out.print(a + "\t");
		}

	}
}
