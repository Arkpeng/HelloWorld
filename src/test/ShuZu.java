package test;

public class ShuZu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={1,2,3,4,5,6,7,8,9,10};
		String b[]=new String[] {""};
		int sum=0;
		for(int i=0;i<10;i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		int c[]= {8,3,2,4,1,6,10};
//		for(int i=0;i<c.length;i++) {
//		System.out.print(c[i]+" ");
//		}
		
		int min =c[0];
		for(int j=0;j<c.length-1;j++) {
			if(c[j+1]<min) {
				min = c[j+1];
			}
		}
		System.out.println(min);
		
		int myarr[][]= {{1,2,0},{4,5,10},{3,5}};
		System.out.println(myarr[1][1]);
	}

}
