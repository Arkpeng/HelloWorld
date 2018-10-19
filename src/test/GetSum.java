package test;

public class GetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i = 2;i<=100;i +=2) {
			sum = sum+i;
			System.out.println(i);
		}
		System.out.println(sum);
	}

}
