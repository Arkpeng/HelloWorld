package test;

public class insertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 9, 7, 6, 1, 2, 8, 4, 3, 5, 0 };
		int temp;
		int j;
		int size=arr.length;
		System.out.println("ԭ���飺");
		for (int a : arr) {
			System.out.print(a + "\t");
		}
		
//		for(int i=1;i<size;i++) {  //����Ĵ���
//			temp = arr[i];
//
//			for(j=i;j>0&&arr[j-1]>temp;j--) {
//				arr[j]=arr[j-1];
//			}
//			arr[j]=temp;
//		}
		
		for(int i = 1; i < size;i++){//���������
            temp = arr[i];//����temp��Ϊ�˷�ֹ����i֮ǰ��Ԫ������ƶ�����������i��Ԫ��
            for(j=i-1; j>=0&&arr[j]>temp; j--) {//������iλ��Ԫ�ص�Ԫ�������
                arr[j+1] = arr[j];
            }
            arr[j+1]= temp;//�ҵ�iӦ���ڵ�λ�ã���ֵ���ô˴� 
        }
		
		System.out.println();
		System.out.println("������");
		for (int a : arr) {
			System.out.print(a + "\t");
		}

	}
}
