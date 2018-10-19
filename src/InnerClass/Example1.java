package InnerClass;

public class Example1 {
	int sum,i;
	class InnerClass{
		int[] arr = {1,2,3,4,5};	
		public void sum() {
			for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
			}
			System.out.println(sum);
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1.InnerClass ex = new Example1().new InnerClass();
		ex.sum();
	}

}
