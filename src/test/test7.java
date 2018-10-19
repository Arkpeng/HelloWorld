package test;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		int j = 1;
		for(int i=1;i<=20;i++) {
			j=i*j;
			sum=sum+1.0/j;
		}
		System.out.println(sum);
	}

}
