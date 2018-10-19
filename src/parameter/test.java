package parameter;
class Change{
	public void change(String s) {
		s = "Hello!";
	}
	public void change(int[] arr) {
		arr[0] = 5;
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Change c = new Change();
		String s = "java";
		System.out.println("传递前："+s);
		c.change(s);
		System.out.println("传递后："+s);
		
		int[] arr = {1,3,7,8,9};
		System.out.println("传递前："+arr[0]);
		c.change(arr);
		System.out.println("传递后："+arr[0]);
	}

}
